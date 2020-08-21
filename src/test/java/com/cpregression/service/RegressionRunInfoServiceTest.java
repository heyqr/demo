package com.cpregression.service;

import com.cpregression.DemoApplicationTest;
import com.cpregression.dao.RegressionRunInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegressionRunInfoServiceTest extends DemoApplicationTest {

    @Autowired
    public RegressionRunInfoService regressionRunInfoService;

    @Test
    public void getAllRuns() {
        List<RegressionRunInfo> regressionRunInfoList = regressionRunInfoService.list();

        Assert.assertEquals(regressionRunInfoList.size(), 2);
    }

}