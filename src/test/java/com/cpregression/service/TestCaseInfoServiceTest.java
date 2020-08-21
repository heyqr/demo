package com.cpregression.service;

import com.cpregression.DemoApplicationTest;
import com.cpregression.dao.RegressionRunInfo;
import com.cpregression.dao.TestCaseInfo;
import com.cpregression.repository.TestCaseInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@Component
public class TestCaseInfoServiceTest  extends DemoApplicationTest {
    @Autowired
    public TestCaseInfoService testCaseInfoService;

    @Test
    public void getAllCaseInfo() {
        List<TestCaseInfo> testCaseInfoList = testCaseInfoService.list();

        Assert.assertEquals(testCaseInfoList.size(), 2);
    }
}