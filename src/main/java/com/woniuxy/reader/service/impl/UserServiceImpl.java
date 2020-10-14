package com.woniuxy.reader.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniuxy.reader.entity.Author;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.mapper.AuthorMapper;
import com.woniuxy.reader.mapper.UserMapper;
import com.woniuxy.reader.service.UserService;
import com.woniuxy.reader.vo.UserVO;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh_o
 * @since 2020-10-06
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private AuthorMapper authorMapper;

    /**
     * 获取全部用户
     * @return
     */
    @Override
    public IPage<User> listUsers(UserVO vo) {
        // 动态添加条件
        return userMapper.selectPage(new Page<User>(vo.getPageNum() ,vo.getPageSize()),
                new QueryWrapper<User>().like(StringUtils.isNotBlank(vo.getUsername()), User.USERNAME, vo.getUsername()));
    }

    /**
     * 根据用户名获取用户信息
     * @param userId
     * @return
     */
    @Override
    public User getUserById(Integer userId) {
        return userMapper.selectById(userId);
    }

    /**
     * 用户注册
     * @param user
     */
    @Override
    public void register(User user) {
        // 判断手机号是否存在
        boolean telExists = !userMapper.selectList(new QueryWrapper<User>().eq(User.USER_TEL, user.getUserTel())).isEmpty();
        if (telExists) {
            // 存在则抛出异常
            throw new RuntimeException("该用户已存在");
        }
        // 随机生成用户名
        String userName = RandomUtil.randomString(6);
        user.setUsername(userName);
        // 密码加密
        Md5Hash md5 = new Md5Hash(user.getPassword(), "woNiuReAdeR*79", 1024);
        user.setPassword(md5.toString());
        // 新增用户
        userMapper.insert(user);
    }

    /**
     * 用户登录
     * @param user
     */
    @Override
    public Map<String, Object> login(User user) {
        // 判断手机号是否存在
        User userInfo = userMapper.selectOne(new QueryWrapper<User>().eq(User.USER_TEL, user.getUserTel()));
        if (userInfo == null) {
            // 不存在抛出异常
            throw new UnknownAccountException();
        }
        // 判断密码是否正确
        Md5Hash md5 = new Md5Hash(user.getPassword(), "woNiuReAdeR*79", 1024);
        user.setPassword(md5.toString());
        // 密码不正确
        if (!user.getPassword().equals(userInfo.getPassword())) {
            throw new IncorrectCredentialsException();
        }
        // 定义返回数据
        HashMap<String, Object> resValue = new HashMap<>(3);
        resValue.put("userId", userInfo.getId());
        resValue.put("userName", userInfo.getUsername());
        // 判断是否为作者
        Author author = authorMapper.selectOne(new QueryWrapper<Author>().eq(Author.AUTHOR_TEL, userInfo.getUserTel()));
        if (author != null) {
            resValue.put("authorId", author.getAuthorId());
        }
        return resValue;
    }

}
