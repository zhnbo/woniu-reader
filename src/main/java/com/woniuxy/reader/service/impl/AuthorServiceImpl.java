package com.woniuxy.reader.service.impl;

import com.woniuxy.reader.entity.Author;
import com.woniuxy.reader.mapper.AuthorMapper;
import com.woniuxy.reader.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh_o
 * @since 2020-10-09
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

}
