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
@Table(name = "travelmanagers", schema = "dbo")
public class TravelManager {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "travelmanagername_ja", length = Integer.MAX_VALUE)
    private String travelManagerNameJa;

    @Column(name = "travelmanagername_en", length = Integer.MAX_VALUE)
    private String travelManagerNameEn;

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
