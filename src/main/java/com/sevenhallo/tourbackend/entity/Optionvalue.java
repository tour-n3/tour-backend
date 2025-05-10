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
@Table(name = "optionvalue", schema = "dbo")
public class Optionvalue {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "optionformrelationid", nullable = false)
    private Integer optionformrelationid;

    @NotNull
    @Column(name = "optiondefinerelationid", nullable = false)
    private Integer optiondefinerelationid;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optiondefineid;

    @Column(name = "value_ja", length = Integer.MAX_VALUE)
    private String valueJa;

    @Column(name = "value_en", length = Integer.MAX_VALUE)
    private String valueEn;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleflag;

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