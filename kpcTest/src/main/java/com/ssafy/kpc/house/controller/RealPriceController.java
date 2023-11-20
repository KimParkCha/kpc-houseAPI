package com.ssafy.kpc.house.controller;

import com.ssafy.kpc.house.model.dto.RealPriceDto;
import com.ssafy.kpc.house.model.entity.realPrice.RealPrice;
import com.ssafy.kpc.house.model.repository.RealPriceRepository;
import com.ssafy.kpc.house.model.service.RealPriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/realprice")
public class RealPriceController {

    private final RealPriceService realPriceService;

    public RealPriceController(RealPriceService realPriceService) {
        this.realPriceService = realPriceService;
    }

    @GetMapping("/list/{complex_no}")
    public ResponseEntity<List<RealPrice>> getRealPrice(@PathVariable Long complex_no){
        List<RealPrice> realPriceList = realPriceService.getRealPrice(complex_no);
        return new ResponseEntity<List<RealPrice>>(realPriceList, HttpStatus.OK);
    }
}
