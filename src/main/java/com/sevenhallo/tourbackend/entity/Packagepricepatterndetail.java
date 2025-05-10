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
@Table(name = "packagepricepatterndetail", schema = "dbo")
public class Packagepricepatterndetail {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "packagepricepatternid", nullable = false)
    private Integer packagepricepatternid;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "packagebasicpricepatterntypeid")
    private Integer packagebasicpricepatterntypeid;

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