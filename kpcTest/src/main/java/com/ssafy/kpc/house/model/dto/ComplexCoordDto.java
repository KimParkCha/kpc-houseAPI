package com.ssafy.kpc.house.model.dto;

import lombok.*;

public interface ComplexCoordDto {
    String getComplexName();
    String getCortarAddress();
    Long getComplexNo();
    Long getCortarNo();
    Double getLatitude();
    Double getLongitude();
}
