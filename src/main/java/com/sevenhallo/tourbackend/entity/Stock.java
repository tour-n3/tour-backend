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
@Table(name = "stock", schema = "dbo")
public class Stock {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "targetid", nullable = false)
    private Integer targetid;

    @NotNull
    @Column(name = "targettype", nullable = false)
    private Integer targettype;

    @NotNull
    @Column(name = "targetdate", nullable = false)
    private Instant targetdate;

    @NotNull
    @Column(name = "stocknumber", nullable = false)
    private Integer stocknumber;

    @NotNull
    @Column(name = "applicationnumber", nullable = false)
    private Integer applicationnumber;

    @NotNull
    @Column(name = "availableflag", nullable = false)
    private Boolean availableflag = false;

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