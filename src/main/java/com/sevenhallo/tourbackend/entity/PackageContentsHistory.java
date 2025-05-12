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
@Table(name = "packagecontentshistory", schema = "dbo")
public class PackageContentsHistory {
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
    @Column(name = "packageid", nullable = false)
    private Integer packageId;

    @NotNull
    @Column(name = "distanceno", nullable = false)
    private Integer distanceNo;

    @NotNull
    @Column(name = "contentstype", nullable = false)
    private Integer contentsType;

    @Column(name = "planid")
    private Integer planId;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderNo;

    @NotNull
    @Column(name = "suggestflag", nullable = false)
    private Boolean suggestFlag = false;

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
