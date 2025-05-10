package com.sevenhallo.tourbackend.entity2;

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
public class Travelmanager {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "travelmanagername_ja", length = Integer.MAX_VALUE)
    private String travelmanagernameJa;

    @Column(name = "travelmanagername_en", length = Integer.MAX_VALUE)
    private String travelmanagernameEn;

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