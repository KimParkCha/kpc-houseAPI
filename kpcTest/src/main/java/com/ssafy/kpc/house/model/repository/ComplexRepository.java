package com.ssafy.kpc.house.model.repository;

import com.ssafy.kpc.house.model.entity.complex.Complex;
import com.ssafy.kpc.house.model.entity.complexDetail.ComplexDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long> {
    @Query("select cp from Complex cp where complexNo=1")
    Complex test();

    @Query("select cp from Complex cp where longitude >= :ha and longitude <= :oa and latitude <= :pa and latitude >= :qa")
    List<Complex> selectByCoord(
            @Param("ha") Double ha,
            @Param("oa") Double oa,
            @Param("pa") Double pa,
            @Param("qa") Double qa);
}
