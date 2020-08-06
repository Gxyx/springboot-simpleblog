package com.san.service.impl;

import com.san.entity.Blog;
import com.san.mapper.BlogMapper;
import com.san.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sanqi
 * @since 2020-08-03
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
