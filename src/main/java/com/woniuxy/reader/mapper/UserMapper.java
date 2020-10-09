package com.woniuxy.reader.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.vo.UserVO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zh_o
 * @since 2020-10-06
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取用户详情列表
     * 用户、订阅联表
     *
     * @param vo
     * @param page
     * @param queryWrapper
     * @return
     */
    IPage<User> listUserAndSubscribe(IPage<User> page, @Param(Constants.WRAPPER) Wrapper<User> queryWrapper, UserVO vo);

}
