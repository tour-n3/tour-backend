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
@Table(name = "optiontabhistory", schema = "dbo")
public class Optiontabhistory {
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
    @Column(name = "targetid", nullable = false)
    private Integer targetid;

    @NotNull
    @Column(name = "optiontabrelationtype", nullable = false)
    private Integer optiontabrelationtype;

    @Column(name = "title_ja", length = Integer.MAX_VALUE)
    private String titleJa;

    @Column(name = "title_en", length = Integer.MAX_VALUE)
    private String titleEn;

    @NotNull
    @Column(name = "releaseflag", nullable = false)
    private Integer releaseflag;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

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