package com.cpregression.repository;

import com.cpregression.dao.TestCaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseInfoRepository extends JpaRepository<TestCaseInfo, Integer> {
}
