package com.service.impl;

import com.dao.BaseDao;
import com.service.TestIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestIServiceImpl implements TestIService {

    @Autowired
    BaseDao baseDao;

    @Override
    public Map<String, Object> getEntity() {
       return baseDao.findOneByName("中国中医科学院中医门诊部");
    }
}
