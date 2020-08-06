package com.san.mapper;

import com.san.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sanqi
 * @since 2020-08-03
 */
@Mapper
public interface BlogMapper extends BaseMapper<Blog> {

}
