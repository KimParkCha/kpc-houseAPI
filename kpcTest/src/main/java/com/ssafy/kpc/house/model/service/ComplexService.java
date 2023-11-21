package com.ssafy.kpc.house.model.service;

import com.ssafy.kpc.house.model.dto.ComplexCoordDto;
import com.ssafy.kpc.house.model.entity.complex.Complex;
import com.ssafy.kpc.house.model.repository.ComplexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComplexService {
    private final ComplexRepository complexRepository;

    public Complex test() {
        return complexRepository.test();
    }
    public List<Complex> findByCoord(
            Double ha,
            Double oa,
            Double pa,
            Double qa) {
        return complexRepository.selectByCoord(ha, oa, pa, qa);
    }
    public List<ComplexCoordDto> findCoordByCoord(
            Double ha,
            Double oa,
            Double pa,
            Double qa
    ) {
        return complexRepository.selectCoordByCoord(ha, oa, pa, qa);
    }
}
