package com.ssafy.kpc.house.model.service;

import com.ssafy.kpc.house.model.entity.complexDetail.ComplexDetail;
import com.ssafy.kpc.house.model.repository.ComplexDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComplexPyeongDetailService {
    private final ComplexDetailRepository complexDetailRepository;

    public ComplexDetail test() {
        return complexDetailRepository.test();
    }

    public Optional<ComplexDetail> findByComplexNo(Long complexNo) {
        return complexDetailRepository.findById(complexNo);
    }
}
