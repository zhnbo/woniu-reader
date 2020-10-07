package com.woniuxy.reader.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.vo.UserVO;

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


}
