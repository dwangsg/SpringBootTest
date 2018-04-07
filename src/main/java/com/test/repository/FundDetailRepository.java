package com.test.repository;

import com.test.model.FundDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundDetailRepository extends JpaRepository <FundDetail,Long>{

    FundDetail findByMStarID(String mStarId);
}
