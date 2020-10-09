package com.woniuxy.reader.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.woniuxy.reader.entity.Author;
import com.woniuxy.reader.vo.AuthorVO;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zh_o
 * @since 2020-10-09
 */
public interface AuthorMapper extends BaseMapper<Author> {

    /**
     * 作者列表
     * 作者、书籍联表
     *
     * @param page
     * @param queryWrapper
     * @param vo
     * @return
     */
    IPage<Author> listAuthorByBook(IPage<Author> page, QueryWrapper<Author> queryWrapper, AuthorVO vo);

}
