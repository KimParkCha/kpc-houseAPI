package com.ssafy.kpc.house.model.entity.complexDetail;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ComplexPyeongDetail.ComplexPyeongDetailPK.class)
@Getter @Setter
public class ComplexPyeongDetail {
    @Id
    private Long complexNo;
    @Id
    private Long pyeongNo;
    private Double supplyAreaDouble;
    private Double supplyArea;
    private String pyeongName;
    private Double supplyPyeong;
    private String pyeongName2;
    private Double exclusiveArea;
    private Double exclusivePyeong;
    private int householdCountByPyeong;
    private String realEstateTypeCode;
    private int exclusiveRate;

    @OneToOne
    @JoinColumn(name = "complexNo", insertable = false, updatable = false)
    @JoinColumn(name = "pyeongNo", insertable = false, updatable = false)
    ArticleStatistics articleStatistics; // 매매호가

    @OneToOne
    @JoinColumn(name = "complexNo", insertable = false, updatable = false)
    @JoinColumn(name = "pyeongNo", insertable = false, updatable = false)
    LandPriceMaxByPtp landPriceMaxByPtp;

    class ComplexPyeongDetailPK implements Serializable {
        private Long complexNo;
        private Long pyeongNo;
    }
}
