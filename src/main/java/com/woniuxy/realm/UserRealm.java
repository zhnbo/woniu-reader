package com.woniuxy.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 *
 * 自定义用户 Realm
 * @author: zh_o
 * @date: 2020-9-28
 *
 */
public class UserRealm extends AuthorizingRealm {

    //@Autowired
    //private MenuService menuService;
    //
    //@Autowired
    //private UserService userService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //// 获取身份信息
        //User user = (User) principalCollection.getPrimaryPrincipal();
        //// 根据用户信息查询出其所有权限
        //List<Menu> permissions = menuService.listPermissions(user);
        //// 循环添加所有权限
        //SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //for (Menu permission : permissions) {
        //    if (permission != null) {
        //        authorizationInfo.addStringPermission(permission.getName());
        //    }
        //}
        //Set<String> stringPermissions = authorizationInfo.getStringPermissions();
        //return authorizationInfo;
        return null;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //// 获取身份信息
        //String username = (String) token.getPrincipal();
        //// 根据用户名查询用户信息
        //User user = userService.getUserByUsername(username);
        //if (user != null) {
        //    // 创建认证信息对象
        //    SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,
        //            user.getPassword(), ByteSource.Util.bytes("23*xdy%="),getName());
        //    return authenticationInfo;
        //}
        return null;
    }
}
