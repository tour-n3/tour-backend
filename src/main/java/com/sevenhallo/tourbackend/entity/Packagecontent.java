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
@Table(name = "packagecontents", schema = "dbo")
public class Packagecontent {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "packageid", nullable = false)
    private Integer packageid;

    @NotNull
    @Column(name = "distanceno", nullable = false)
    private Integer distanceno;

    @NotNull
    @Column(name = "contentstype", nullable = false)
    private Integer contentstype;

    @Column(name = "planid")
    private Integer planid;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

    @NotNull
    @Column(name = "suggestflag", nullable = false)
    private Boolean suggestflag = false;

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