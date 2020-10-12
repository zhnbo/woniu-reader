package com.woniuxy.reader.service.impl;

import com.woniuxy.reader.entity.Category;
import com.woniuxy.reader.mapper.CategoryMapper;
import com.woniuxy.reader.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
