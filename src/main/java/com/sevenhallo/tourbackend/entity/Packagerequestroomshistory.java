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
@Table(name = "packagerequestroomshistory", schema = "dbo")
public class Packagerequestroomshistory {
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
    @Column(name = "packageid", nullable = false)
    private Integer packageid;

    @NotNull
    @Column(name = "roomno", nullable = false)
    private Integer roomno;

    @NotNull
    @Column(name = "malenumber", nullable = false)
    private Integer malenumber;

    @NotNull
    @Column(name = "femalenumber", nullable = false)
    private Integer femalenumber;

    @Column(name = "child7_11")
    private Integer child711;

    @Column(name = "child3_6")
    private Integer child36;

    @Column(name = "child0_2")
    private Integer child02;

    @Column(name = "memo", length = Integer.MAX_VALUE)
    private String memo;

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
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

}