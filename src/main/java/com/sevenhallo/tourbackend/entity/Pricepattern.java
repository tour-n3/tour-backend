package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "pricepattern", schema = "dbo")
public class Pricepattern {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planid;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @Column(name = "contentsdetailtypeid")
    private Integer contentsdetailtypeid;

    @NotNull
    @Column(name = "minaccepted", nullable = false)
    private Integer minaccepted;

    @NotNull
    @Column(name = "maxaccepted", nullable = false)
    private Integer maxaccepted;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

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

    @NotNull
    @ColumnDefault("false")
    @Column(name = "dontvisible", nullable = false)
    private Boolean dontvisible = false;

}