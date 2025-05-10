package com.sevenhallo.tourbackend.entity2;

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
@Table(name = "requestdetailnumberhistory", schema = "dbo")
public class Requestdetailnumberhistory {
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
    @Column(name = "requestdetailid", nullable = false)
    private Integer requestdetailid;

    @NotNull
    @Column(name = "requestdetailroomid", nullable = false)
    private Integer requestdetailroomid;

    @NotNull
    @Column(name = "pricepatterndetailid", nullable = false)
    private Integer pricepatterndetailid;

    @NotNull
    @Column(name = "basicpricepatterntypeid", nullable = false)
    private Integer basicpricepatterntypeid;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @NotNull
    @Column(name = "malenumber", nullable = false)
    private Integer malenumber;

    @NotNull
    @Column(name = "femalenumber", nullable = false)
    private Integer femalenumber;

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

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

    @NotNull
    @Column(name = "includecapacity", nullable = false)
    private Boolean includecapacity = false;

    @NotNull
    @Column(name = "fixedvalue", nullable = false)
    private Boolean fixedvalue = false;

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

    @Column(name = "updtransactionprice")
    private Integer updtransactionprice;

    @Column(name = "updcommission")
    private Integer updcommission;

    @Column(name = "updpayment")
    private Integer updpayment;

}