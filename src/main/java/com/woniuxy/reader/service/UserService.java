package com.woniuxy.reader.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.vo.UserVO;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zh_o
 * @since 2020-10-06
 */
public interface UserService {

    /**
     * 获取全部用户
     * @param vo
     * @return
     */
    IPage<User> listUsers(UserVO vo);

    /**
     * 根据用户名获取用户信息
     * @param userId
     * @return
     */
    User getUserById(Integer userId);

    /**
     * 用户注册
     * @param user
     */
    void register(User user);

    /**
     * 用户登录
     * @param user
     */
    Map<String, Object> login(User user);

}
