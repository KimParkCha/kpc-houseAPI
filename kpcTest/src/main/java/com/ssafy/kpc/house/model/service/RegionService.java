package com.ssafy.kpc.house.model.service;

import com.ssafy.kpc.house.model.entity.region.Region;
import com.ssafy.kpc.house.model.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;

    public Region test() {
        return regionRepository.test();
    }

    public List<Region> regionDtoList(Long cortarNo){
        return regionRepository.findByCortarNo(cortarNo);
    }

    public List<Region> searchByKeyword(String keyword){
        return regionRepository.findRegionsByCortarNameContaining(keyword);
    }
}
