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
@Table(name = "agenthistory", schema = "dbo")
public class Agenthistory {
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

    @Size(max = 10)
    @NotNull
    @Column(name = "agentcode", nullable = false, length = 10)
    private String agentcode;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @Size(max = 10)
    @Column(name = "postcode", length = 10)
    private String postcode;

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
    private Integer countrycode;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellphone;

    @Size(max = 100)
    @Column(name = "imagepath", length = 100)
    private String imagepath;

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

    @NotNull
    @Column(name = "depositflag", nullable = false)
    private Boolean depositflag = false;

    @Column(name = "adminmemo", length = Integer.MAX_VALUE)
    private String adminmemo;

    @Column(name = "adminmemoupdatedate")
    private Instant adminmemoupdatedate;

    @Size(max = 128)
    @Column(name = "adminmemoupdateuserid", length = 128)
    private String adminmemoupdateuserid;

    @NotNull
    @Column(name = "adminmemotype", nullable = false)
    private Integer adminmemotype;

}