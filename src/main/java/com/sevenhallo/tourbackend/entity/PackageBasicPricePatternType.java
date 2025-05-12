package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "packagebasicpricepatterntype", schema = "dbo")
public class PackageBasicPricePatternType {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "packageid", nullable = false)
    private Integer packageId;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

    @NotNull
    @Column(name = "includecapacity", nullable = false)
    private Boolean includeCapacity = false;

    @NotNull
    @Column(name = "fixedvalue", nullable = false)
    private Boolean fixedValue = false;

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
