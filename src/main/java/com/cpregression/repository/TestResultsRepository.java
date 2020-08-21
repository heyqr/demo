package com.cpregression.repository;

import com.cpregression.dao.TestResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultsRepository extends JpaRepository<TestResults, Integer> {



}
