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
@Table(name = "contentsdetailtype", schema = "dbo")
public class ContentsDetailType {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsId;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @NotNull
    @Column(name = "roomavailablemin", nullable = false)
    private Integer roomAvailableMin;

    @NotNull
    @Column(name = "roomavailablemax", nullable = false)
    private Integer roomAvailableMax;

    @NotNull
    @Column(name = "roomtypeselect", nullable = false)
    private Integer roomTypeSelect;

    @NotNull
    @Column(name = "roomextentmin", nullable = false)
    private Integer roomExtentMin;

    @NotNull
    @Column(name = "roomextentmax", nullable = false)
    private Integer roomExtentMax;

    @NotNull
    @Column(name = "roomextentunit", nullable = false)
    private Integer roomExtentUnit;

    @NotNull
    @Column(name = "roombath", nullable = false)
    private Integer roomBath;

    @NotNull
    @Column(name = "roombed", nullable = false)
    private Integer roomBed;

    @NotNull
    @Column(name = "roomtoilet", nullable = false)
    private Integer roomToilet;

    @Column(name = "description_ja", length = Integer.MAX_VALUE)
    private String descriptionJa;

    @Column(name = "description_en", length = Integer.MAX_VALUE)
    private String descriptionEn;

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

    @Column(name = "roomcount")
    private Integer roomCount;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleFlag;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

}
