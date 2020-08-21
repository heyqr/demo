package com.cpregression.service;

import com.cpregression.DemoApplicationTest;
import com.cpregression.dao.TestResults;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestResultsServiceTest extends DemoApplicationTest {
    @Autowired
    public TestResultsService testResultsService;

    @Test
    public void getAllResults() {
        List<TestResults> testResultsList = testResultsService.list();

        Assert.assertEquals(testResultsList.size(), 4);
    }
}