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
@Table(name = "agent", schema = "dbo")
public class Agent {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @NotNull
    @Column(name = "agentcode", nullable = false, length = 10)
    private String agentCode;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @Size(max = 10)
    @Column(name = "postcode", length = 10)
    private String postCode;

    @Size(max = 200)
    @Column(name = "address", length = 200)
    private String address;

    @Size(max = 20)
    @Column(name = "tel", length = 20)
    private String tel;

    @Size(max = 20)
    @Column(name = "fax", length = 20)
    private String fax;

    @NotNull
    @Column(name = "countrycode", nullable = false)
    private Integer countryCode;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellPhone;

    @Size(max = 100)
    @Column(name = "imagepath", length = 100)
    private String imagePath;

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

    @NotNull
    @Column(name = "depositflag", nullable = false)
    private Boolean depositFlag = false;

    @Column(name = "adminmemo", length = Integer.MAX_VALUE)
    private String adminMemo;

    @Column(name = "adminmemoupdatedate")
    private Instant adminMemoUpdateDate;

    @Size(max = 128)
    @Column(name = "adminmemoupdateuserid", length = 128)
    private String adminMemoUpdateUserId;

    @NotNull
    @Column(name = "adminmemotype", nullable = false)
    private Integer adminMemoType;

}
