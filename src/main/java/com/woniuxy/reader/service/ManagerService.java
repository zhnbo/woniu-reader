package com.woniuxy.reader.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.woniuxy.reader.entity.Author;
import com.woniuxy.reader.entity.Manager;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.vo.AuthorVO;
import com.woniuxy.reader.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zh_o
 * @since 2020-10-09
 */
public interface ManagerService extends IService<Manager> {

    /**
     * 获取用户详情列表
     * 用户、订阅联表
     *
     * @param vo
     * @return
     */
    IPage<User> listUserAndSubscribe(UserVO vo);

    /**
     * 作者列表
     * 作者、书籍联表
     *
     * @param vo
     * @return
     */
    IPage<Author> listAuthorByBook(AuthorVO vo);
}
