package com.simplify.sample.db.mapper;

import com.simplify.sample.db.dto.Test;
import com.simplify.sample.db.dto.contentVO;
import com.simplify.sample.db.dto.memberVO;

import java.util.HashMap;
import java.util.List;

public interface TestMapper {
    public List<Test> getAll() throws Exception;

    void insertMainList(memberVO map) throws Exception;
    memberVO checkUserInfo(memberVO map) throws Exception;
    void insertContent(contentVO con) throws Exception;

 }
