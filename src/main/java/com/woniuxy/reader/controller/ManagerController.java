package com.woniuxy.reader.controller;


import com.woniuxy.reader.service.impl.ManagerServiceImpl;
import com.woniuxy.reader.vo.AuthorVO;
import com.woniuxy.reader.vo.UserVO;
import com.woniuxy.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员控制器
 *
 * @author zh_o
 * @since 2020-10-09
 */
@RestController
@RequestMapping("/manager")
@Api(tags = "管理员接口")
public class ManagerController {

    @Autowired
    private ManagerServiceImpl managerService;

    /**
     * 用户列表
     *
     * @param vo
     * @return
     */
    @RequestMapping("user")
    @ApiOperation("查询用户列表信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名"),
            @ApiImplicitParam(name = "pageNum", value = "当前页"),
            @ApiImplicitParam(name = "pageSize", value = "每页显示条数"),
    })
    public Object listUsers(UserVO vo) {
        return ResponseResult.success(managerService.listUserAndSubscribe(vo));
    }

    /**
     * 作者列表
     *
     * @param vo
     * @return
     */
    @RequestMapping("author")
    @ApiOperation("查询作者列表信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "作者名 / 笔名 "),
            @ApiImplicitParam(name = "pageNum", value = "当前页"),
            @ApiImplicitParam(name = "pageSize", value = "每页显示条数"),
    })
    public Object listAuthors(AuthorVO vo) {
        return ResponseResult.success(managerService.listAuthorByBook(vo));
    }

}

