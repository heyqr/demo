package com.cpregression.service;

import com.cpregression.dao.RegressionRunInfo;
import com.cpregression.repository.RegressionRunInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegressionRunInfoService{
    @Autowired
    private RegressionRunInfoRepository regressionRunInfoRepository;

    public List<RegressionRunInfo> list() {
        return regressionRunInfoRepository.findAll();
    }

    public Page<RegressionRunInfo> listAll(Pageable pageable) {
        List<RegressionRunInfo> runInfoMaster = regressionRunInfoRepository.findAll();
        return new PageImpl<>(runInfoMaster, pageable, runInfoMaster.size());
    }

    public Page<RegressionRunInfo> listByApp(String app, Pageable pageable) {
        List<RegressionRunInfo> runInfoMaster = regressionRunInfoRepository.findByApp(app);
        return new PageImpl<>(runInfoMaster, pageable, runInfoMaster.size());
    }

}
