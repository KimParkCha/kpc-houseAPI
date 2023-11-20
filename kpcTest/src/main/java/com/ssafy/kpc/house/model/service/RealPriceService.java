package com.ssafy.kpc.house.model.service;

import com.ssafy.kpc.house.model.dto.RealPriceDto;
import com.ssafy.kpc.house.model.entity.realPrice.RealPrice;
import com.ssafy.kpc.house.model.repository.RealPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RealPriceService {

    private final RealPriceRepository realPriceRepository;


    public List<RealPrice> getRealPrice(Long complex_no){
        List<RealPrice> realPriceList = realPriceRepository.findByComplexNo(complex_no);
        return realPriceList;
    }

}
