package com.simplify.sample.db.service;

import com.simplify.sample.db.dto.Test;
import com.simplify.sample.db.dto.memberVO;
import com.simplify.sample.db.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    TestMapper testMapper;

    public List<Test> getAll() throws Exception{
        return testMapper.getAll();
    }

    public void insertMain(memberVO map) throws Exception{
        testMapper.insertMainList(map);
    }

    public memberVO checkUserInfo(memberVO map) throws Exception{
        return testMapper.checkUserInfo(map);
    }

}
