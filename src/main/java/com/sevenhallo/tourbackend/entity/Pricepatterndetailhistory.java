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
@Table(name = "pricepatterndetailhistory", schema = "dbo")
public class Pricepatterndetailhistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "historydata_targethistoryid", nullable = false)
    private Integer historydataTargethistoryid;

    @NotNull
    @Column(name = "historydata_enablestartdate", nullable = false)
    private Instant historydataEnablestartdate;

    @Column(name = "historydata_enableenddate")
    private Instant historydataEnableenddate;

    @NotNull
    @Column(name = "pricepatternid", nullable = false)
    private Integer pricepatternid;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "basicpricepatterntypeid")
    private Integer basicpricepatterntypeid;

    @NotNull
    @Column(name = "transactionprice", nullable = false)
    private Integer transactionprice;

    @NotNull
    @Column(name = "commissionrate", nullable = false, precision = 18, scale = 2)
    private BigDecimal commissionrate;

    @NotNull
    @Column(name = "commission", nullable = false)
    private Integer commission;

    @NotNull
    @Column(name = "payment", nullable = false)
    private Integer payment;

    @NotNull
    @Column(name = "sellingprice", nullable = false)
    private Integer sellingprice;

    @NotNull
    @Column(name = "delflag", nullable = false)
    private Boolean delflag = false;

    @Size(max = 128)
    @Column(name = "updateapplicationuserid", length = 128)
    private String updateapplicationuserid;

    @NotNull
    @Column(name = "updatedate", nullable = false)
    private Instant updatedate;

    @NotNull
    @Column(name = "createdate", nullable = false)
    private Instant createdate;

}