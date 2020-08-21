package com.cpregression.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "testresults")
@Data
public class TestResults {

    @Id
    private int primKey;

    private int regressionrunid;
    private String testname;
    private String comment;
    private int matchespreviousrun;
    private String description;
    private String t2;
    private String baseversion;
    private String t3;
    private int id;
    private String t1;
    private double maxdiff;
    private int matchsbaseline;
    private int numberofdiffs;
    private int numberofdiffsfromprevious;
    private String category;
    private Integer rebaselined;
    private String tester;

}
