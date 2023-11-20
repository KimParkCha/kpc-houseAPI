package com.ssafy.kpc.house.model.repository;

import com.ssafy.kpc.house.model.entity.complexDetail.ComplexDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexDetailRepository extends JpaRepository<ComplexDetail, Long> {
    @Query("select cp from Complex cp where complexNo=1")
    ComplexDetail test();
}
