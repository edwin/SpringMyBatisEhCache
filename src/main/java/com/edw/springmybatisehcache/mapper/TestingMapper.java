package com.edw.springmybatisehcache.mapper;

import com.edw.springmybatisehcache.bean.Testing;
import java.util.List;

public interface TestingMapper {
    List<Testing> selectAll();
    Testing selectOne(Integer id);
}
