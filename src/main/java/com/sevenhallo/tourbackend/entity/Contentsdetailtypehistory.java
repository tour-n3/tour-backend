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
@Table(name = "contentsdetailtypehistory", schema = "dbo")
public class Contentsdetailtypehistory {
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
    @Column(name = "contentsid", nullable = false)
    private Integer contentsid;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @NotNull
    @Column(name = "roomavailablemin", nullable = false)
    private Integer roomavailablemin;

    @NotNull
    @Column(name = "roomavailablemax", nullable = false)
    private Integer roomavailablemax;

    @NotNull
    @Column(name = "roomtypeselect", nullable = false)
    private Integer roomtypeselect;

    @NotNull
    @Column(name = "roomextentmin", nullable = false)
    private Integer roomextentmin;

    @NotNull
    @Column(name = "roomextentmax", nullable = false)
    private Integer roomextentmax;

    @NotNull
    @Column(name = "roomextentunit", nullable = false)
    private Integer roomextentunit;

    @NotNull
    @Column(name = "roombath", nullable = false)
    private Integer roombath;

    @NotNull
    @Column(name = "roombed", nullable = false)
    private Integer roombed;

    @NotNull
    @Column(name = "roomtoilet", nullable = false)
    private Integer roomtoilet;

    @Column(name = "description_ja", length = Integer.MAX_VALUE)
    private String descriptionJa;

    @Column(name = "description_en", length = Integer.MAX_VALUE)
    private String descriptionEn;

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

    @Column(name = "roomcount")
    private Integer roomcount;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleflag;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

}