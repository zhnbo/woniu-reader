package com.woniuxy.reader.service.impl;

import com.woniuxy.reader.entity.Book;
import com.woniuxy.reader.mapper.BookMapper;
import com.woniuxy.reader.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh_o
 * @since 2020-10-12
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
