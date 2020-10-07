package com.woniuxy.configuration;

import com.woniuxy.realm.UserRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro配置类
 * @author: zh_o
 * @date: 2020/9/28
 */
@Configuration
public class ShiroConfig {

    /**
     * 创建自定义用户 Realm
     * @return
     */
    @Bean
    public UserRealm createUserRealm() {
        UserRealm userRealm = new UserRealm();
        // 创建凭证校验匹配器对象,并设置加密算法为 MD5
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher("MD5");
        // 设置散列次数
        matcher.setHashIterations(1024);
        // 修改凭证校验匹配器
        userRealm.setCredentialsMatcher(matcher);
        return userRealm;
    }

    /**
     * 创建安全管理器
     * @return
     */
    @Bean
    public SecurityManager createSecurityManager() throws NoSuchAlgorithmException {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(createUserRealm());
        // 注册 rememberMe 管理器
        securityManager.setRememberMeManager(cookieRememberReManager());
        return securityManager;
    }

    /**
     * 创建 RememberMe 管理器
     * @return
     * @throws NoSuchAlgorithmException
     */
    @Bean
    public CookieRememberMeManager cookieRememberReManager() throws NoSuchAlgorithmException {
        CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
        // 创建 Cookie
        SimpleCookie cookie = new SimpleCookie("rememberMe");
        // 设置cookie存活时间
        cookie.setMaxAge(60 * 60 * 24 * 3);
        rememberMeManager.setCookie(cookie);
        // 加密
        rememberMeManager.setCipherKey(Base64.decode("ef5s4edY4dAb4dy3s3Gyb5=="));
        return rememberMeManager;
    }

    /**
     * 创建 Shiro 过滤器工厂
     * @return
     * @throws NoSuchAlgorithmException
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() throws NoSuchAlgorithmException {
        //实例化Filter工厂
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //注册securityManager
        shiroFilterFactoryBean.setSecurityManager(createSecurityManager());
        //设置Shiro过滤器过滤规则
        //LinkHashMap是有序的，shiro会根据添加的顺序进行拦截,匹配到过滤器后就执行该过滤器不会在继续向下查找过滤器
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String, String>(16);
        //配置不会被拦截地址规则
        //anon:所有的url都可以不登陆的情况下访问
        //authc：所有url都必须认证通过才可以访问
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/img/**", "anon");
        filterChainDefinitionMap.put("/page/login.html", "anon");
        filterChainDefinitionMap.put("/user/login", "anon");
        filterChainDefinitionMap.put("/user", "anon");
        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
        filterChainDefinitionMap.put("/logout", "logout");
        //如果不满足上方所有的规则 则需要进行登录验证
        //filterChainDefinitionMap.put("/**", "user");
        //未登录时重定向的网页地址
        shiroFilterFactoryBean.setLoginUrl("/page/login.html");

        //将地址过滤规则设置到Filter工厂中
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        //返回
        return shiroFilterFactoryBean;
    }

    /**
     * 授权
     * @return
     * @throws NoSuchAlgorithmException
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() throws NoSuchAlgorithmException {
        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(createSecurityManager());
        return advisor;
    }

    /**
     * 授权
     * @return
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator app=new DefaultAdvisorAutoProxyCreator();
        app.setProxyTargetClass(true);
        return app;
    }


}
