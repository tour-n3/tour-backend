package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "packagepricepatterndetailhistory", schema = "dbo")
public class PackagePricePatternDetailHistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "historydata_targethistoryid", nullable = false)
    private Integer historyDataTargetHistoryId;

    @NotNull
    @Column(name = "historydata_enablestartdate", nullable = false)
    private Instant historyDataEnableStartDate;

    @Column(name = "historydata_enableenddate")
    private Instant historyDataEnableEndDate;

    @NotNull
    @Column(name = "packagepricepatternid", nullable = false)
    private Integer packagePricePatternId;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "packagebasicpricepatterntypeid")
    private Integer packageBasicPricePatternTypeId;

    @NotNull
    @Column(name = "transactionprice", nullable = false)
    private Integer transactionPrice;

    @NotNull
    @Column(name = "commissionrate", nullable = false, precision = 18, scale = 2)
    private BigDecimal commissionRate;

    @NotNull
    @Column(name = "commission", nullable = false)
    private Integer commission;

    @NotNull
    @Column(name = "payment", nullable = false)
    private Integer payment;

    @NotNull
    @Column(name = "sellingprice", nullable = false)
    private Integer sellingPrice;

    @NotNull
    @Column(name = "delflag", nullable = false)
    private Boolean delFlag = false;

    @Size(max = 128)
    @Column(name = "updateapplicationuserid", length = 128)
    private String updateApplicationUserId;

    @NotNull
    @Column(name = "updatedate", nullable = false)
    private Instant updateDate;

    @NotNull
    @Column(name = "createdate", nullable = false)
    private Instant createDate;

}
