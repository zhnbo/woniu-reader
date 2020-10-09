package com.woniuxy.reader.controller;


import com.woniuxy.reader.service.impl.ManagerServiceImpl;
import com.woniuxy.reader.vo.AuthorVO;
import com.woniuxy.reader.vo.UserVO;
import com.woniuxy.result.ResponseResult;
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
public class ManagerController {

    @Autowired
    private ManagerServiceImpl managerService;

    /**
     * 用户列表
     * @param vo
     * @return
     */
    @RequestMapping("user")
    public Object listUsers(UserVO vo) {
        return ResponseResult.success(managerService.listUserAndSubscribe(vo));
    }

    /**
     * 作者列表
     * @param vo
     * @return
     */
    @RequestMapping("author")
    public Object listAuthors(AuthorVO vo) {
        return ResponseResult.success(managerService.listAuthorByBook(vo));
    }

}

