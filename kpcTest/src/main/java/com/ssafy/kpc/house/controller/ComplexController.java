package com.ssafy.kpc.house.controller;

import com.ssafy.kpc.house.model.dto.ComplexCoordDto;
import com.ssafy.kpc.house.model.entity.complex.Complex;
import com.ssafy.kpc.house.model.entity.complexDetail.ComplexDetail;
import com.ssafy.kpc.house.model.service.ComplexDetailService;
import com.ssafy.kpc.house.model.service.ComplexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/complex")
public class ComplexController {

    private final ComplexService complexService;
    private final ComplexDetailService complexDetailService;
    public ComplexController(ComplexService complexService, ComplexDetailService complexDetailService) {
        this.complexService = complexService;
        this.complexDetailService = complexDetailService;
    }

    @GetMapping("/test")
    public ResponseEntity<Complex> test(){
        Complex test = complexService.test();
        ResponseEntity<Complex> response = new ResponseEntity<>(test, HttpStatus.OK);
        return response;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Complex>> findByCoord(
            @RequestParam("ha") Double ha,
            @RequestParam("oa") Double oa,
            @RequestParam("pa") Double pa,
            @RequestParam("qa") Double qa
    ){
        List<Complex> response = complexService.findByCoord(ha, oa, pa, qa);
        log.info("response : {}", response);
        return new ResponseEntity<List<Complex>>(response, HttpStatus.OK);
    }
    @GetMapping("/coord/list")
    public ResponseEntity<List<ComplexCoordDto>> findCoordByCoord(
            @RequestParam("ha") Double ha,
            @RequestParam("oa") Double oa,
            @RequestParam("pa") Double pa,
            @RequestParam("qa") Double qa
    ){
        List<ComplexCoordDto> response = complexService.findCoordByCoord(ha, oa, pa, qa);
        return new ResponseEntity<List<ComplexCoordDto>>(response, HttpStatus.OK);
    }

    @GetMapping("/{complexNo}")
    public ResponseEntity<ComplexDetail> getComplex(@PathVariable("complexNo") Long complexNo){
        Optional<ComplexDetail> res = complexDetailService.findByComplexNo(complexNo);
        if (res.isPresent())
            return new ResponseEntity<ComplexDetail>(res.get(), HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
