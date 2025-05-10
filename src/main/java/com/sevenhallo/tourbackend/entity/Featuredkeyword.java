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
@Table(name = "featuredkeyword", schema = "dbo")
public class Featuredkeyword {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "featuredkeywordtype", nullable = false)
    private Integer featuredkeywordtype;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

    @Size(max = 100)
    @NotNull
    @Column(name = "keyword", nullable = false, length = 100)
    private String keyword;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

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