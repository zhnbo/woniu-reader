package com.woniuxy.reader.controller;


import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.service.UserService;
import com.woniuxy.reader.vo.UserVO;
import com.woniuxy.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 用户控制器
 * @author zh_o
 * @since 2020-10-06
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取全部用户信息
     * @return
     */
    @GetMapping
    @ApiOperation("根据条件查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页"),
            @ApiImplicitParam(name = "pageSize", value = "每页显示数据条数"),
            @ApiImplicitParam(name = "username", value = "用户名")
    })
    public Object listUsers(UserVO vo) {
        return ResponseResult.success(userService.listUsers(vo));
    }

    /**
     * 根据ID获取用户
     * @param userId
     * @return
     */
    @GetMapping("{userId}")
    @ApiOperation("根据用户ID查询用户信息")
    @ApiImplicitParam(name = "userId", value = "用户ID")
    public Object getUser(@PathVariable("userId") Integer userId) {
        return ResponseResult.success(userService.getUserById(userId));
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping
    @ApiOperation("用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userTel", value = "用户手机号"),
            @ApiImplicitParam(name = "password", value = "用户密码")
    })
    public Object register(User user) {
        userService.register(user);
        return ResponseResult.success();
    }

    /**
     * 用户登录
     * @param user
     */
    @PostMapping("login")
    @ApiOperation("用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userTel", value = "用户手机号"),
            @ApiImplicitParam(name = "password", value = "用户密码")
    })
    public Object login(User user) {
        Map<String, Object> resMap = userService.login(user);
        return ResponseResult.success(resMap);
    }
}

