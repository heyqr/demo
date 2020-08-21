package com.cpregression.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "regressionruninfo")
@Data
public class RegressionRunInfo {

    @Id
    @Column(name="regressionrunid")
    private int RegressionRunId;

    private String branch;
    private String version;
    private String model;
    private String rundate;
    private String starttime;
    private String endtime;
    private String logpath;
    private String datapath;
    private int runnumber;
    private String rack;
    private String root;
    private String app;
    private String subrun;
    private String secondaryversion;
}
