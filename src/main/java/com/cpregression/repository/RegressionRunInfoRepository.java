package com.cpregression.repository;

import com.cpregression.dao.RegressionRunInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegressionRunInfoRepository extends JpaRepository<RegressionRunInfo, Integer> {

    List<RegressionRunInfo> findByApp(String app);
}
