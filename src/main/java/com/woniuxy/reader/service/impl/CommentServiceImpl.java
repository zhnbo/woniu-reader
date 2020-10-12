package com.woniuxy.reader.service.impl;

import com.woniuxy.reader.entity.Comment;
import com.woniuxy.reader.mapper.CommentMapper;
import com.woniuxy.reader.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
