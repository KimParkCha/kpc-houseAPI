package com.ssafy.kpc.house.model.repository;

import com.ssafy.kpc.house.model.entity.region.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
    List<Region> findByCortarNo(Long cortarNo);
    List<Region> findRegionsByCortarNameContaining(String cortarName);
    @Query("select re from Region re where cortarName='서울시'")
    Region test();

    @Query("select re from Region re where cortarName like '%keyword%'")
    List<Region> searchByKeyword(@Param("keyword") String keyword);
}
