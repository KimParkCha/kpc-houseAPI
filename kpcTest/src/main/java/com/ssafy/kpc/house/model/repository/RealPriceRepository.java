package com.ssafy.kpc.house.model.repository;

import com.ssafy.kpc.house.model.dto.RealPriceDto;
import com.ssafy.kpc.house.model.entity.complex.Complex;
import com.ssafy.kpc.house.model.entity.realPrice.RealPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealPriceRepository extends JpaRepository<RealPrice, Long> {
    @Query(value = "select * \n" +
            "from ssafy.real_price\n" +
            "where complex_no = :complex_no", nativeQuery = true)
    List<RealPrice> findByComplexNo(@Param("complex_no") Long complex_no);
}
