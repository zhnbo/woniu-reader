package com.woniuxy.reader.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.mapper.UserMapper;
import com.woniuxy.reader.service.UserService;
import com.woniuxy.reader.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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


}
