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
@Table(name = "packagerequest", schema = "dbo")
public class Packagerequest {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

    @NotNull
    @Column(name = "packageid", nullable = false)
    private Integer packageid;

    @NotNull
    @Column(name = "usestartdate", nullable = false)
    private Instant usestartdate;

    @NotNull
    @Column(name = "rooms", nullable = false)
    private Integer rooms;

    @Column(name = "travelers")
    private Integer travelers;

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