package com.cpregression.service;

import com.cpregression.dao.TestResults;
import com.cpregression.repository.TestResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultsService {
    @Autowired
    private TestResultsRepository testResultsRepository;

    public List<TestResults> list() {
        return testResultsRepository.findAll();
    }
}
