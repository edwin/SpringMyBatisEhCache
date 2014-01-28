package com.edw.springmybatisehcache.service;

import com.edw.springmybatisehcache.bean.Testing;
import com.edw.springmybatisehcache.mapper.TestingMapper;
import java.util.List;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testingService")
@Transactional
public class TestingService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    private final Logger logger = Logger.getLogger(this.getClass());
    
    public List<Testing> getAll() {
        try {
            TestingMapper testingMapper = sqlSessionFactory.openSession().getMapper(TestingMapper.class);
            return testingMapper.selectAll();
        } catch (Exception e) {
            logger.error(e,e);
        }
        return null;
    }
    
    public Testing getOne(Integer id) {
        try {
            TestingMapper testingMapper = sqlSessionFactory.openSession().getMapper(TestingMapper.class);
            return testingMapper.selectOne(id);
        } catch (Exception e) {
            logger.error(e,e);
        }
        return null;
    }
    
}
