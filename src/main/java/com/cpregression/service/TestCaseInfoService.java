package com.cpregression.service;

import com.cpregression.dao.TestCaseInfo;
import com.cpregression.repository.TestCaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseInfoService {

    @Autowired
    private TestCaseInfoRepository testCaseInfoRepository;

    public List<TestCaseInfo> list() {
        return testCaseInfoRepository.findAll();
    }

}
