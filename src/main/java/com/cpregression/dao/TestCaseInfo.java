package com.cpregression.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "testcaseinfo")
@Data
public class TestCaseInfo {

    @Id
    private String testname;

    private String testowner;
    private String testlogname;
    private String testtype;
    private String portfolioname;
    private String analysisdate;
    private String newtestname;
    private String subtype;
    private String testgroup;
    private String app;
    private String testpath;
    private String model;
    private String issues;
}
