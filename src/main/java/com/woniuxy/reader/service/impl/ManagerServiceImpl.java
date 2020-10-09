package com.woniuxy.reader.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.reader.entity.Author;
import com.woniuxy.reader.entity.Manager;
import com.woniuxy.reader.entity.User;
import com.woniuxy.reader.mapper.AuthorMapper;
import com.woniuxy.reader.mapper.ManagerMapper;
import com.woniuxy.reader.mapper.UserMapper;
import com.woniuxy.reader.service.ManagerService;
import com.woniuxy.reader.vo.AuthorVO;
import com.woniuxy.reader.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh_o
 * @since 2020-10-09
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private AuthorMapper authorMapper;

    /**
     * 获取用户详情列表
     * 用户、订阅联表
     *
     * @param vo
     * @return
     */
    @Override
    public IPage<User> listUserAndSubscribe(UserVO vo) {
        // 条件构造器
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 添加查询条件
        queryWrapper.like(StringUtils.isNotBlank(vo.getUsername()), User.USERNAME, vo.getUsername());
        // 分页
        Page<User> page = new Page<>(vo.getPageNum(), vo.getPageSize());
        return userMapper.listUserAndSubscribe(page, queryWrapper, vo);
    }

    /**
     * 作者列表
     * 作者、书籍联表
     *
     * @param vo
     * @return
     */
    @Override
    public IPage<Author> listAuthorByBook(AuthorVO vo) {
        // 条件构造器
        QueryWrapper<Author> queryWrapper = new QueryWrapper<>();
        // 添加查询条件
        // 笔名或真实名
        queryWrapper.like(StringUtils.isNotBlank(vo.getName()), Author.PAYMENT, vo.getName())
                .or().like(StringUtils.isNotBlank(vo.getName()), Author.NAME, vo.getName());
        // 分页
        Page<Author> page = new Page<>(vo.getPageNum(), vo.getPageSize());
        return authorMapper.listAuthorByBook(page, queryWrapper, vo);
    }

}
