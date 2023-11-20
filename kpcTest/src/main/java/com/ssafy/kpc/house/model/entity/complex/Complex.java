package com.ssafy.kpc.house.model.entity.complex;

import com.ssafy.kpc.house.model.entity.complexDetail.ComplexDetail;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
// 단지
public class Complex {
    @Id
    Long complexNo;
    String complexName;
    Long cortarNo;
    String realEstateTypeCode;
    String realEstateTypeName;
    String detailAddress;
    Double latitude;
    Double longitude;
    int totalHouseholdCount;
    int totalBuildingCount;
    int highFloor;
    int lowFloor;
    String useApproveYmd;
    int dealCount;
    int leaseCount;
    int rentCount;
    int shirtTermRentCount;
    String cortarAddress;

//    @OneToOne
//    @JoinColumn(name = "complexdetail_no")
//    private ComplexDetail complexDetail;
}
