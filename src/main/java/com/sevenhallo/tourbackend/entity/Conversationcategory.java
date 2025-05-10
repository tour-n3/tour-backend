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
@Table(name = "conversationcategory", schema = "dbo")
public class Conversationcategory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "contacttype", nullable = false)
    private Integer contacttype;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

    @Size(max = 128)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "name_ja", nullable = false, length = 128)
    private String nameJa;

    @Size(max = 128)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "name_en", nullable = false, length = 128)
    private String nameEn;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "parentconversationcategoryid")
    private Integer parentconversationcategoryid;

    @NotNull
    @Column(name = "hierarchylevel", nullable = false)
    private Integer hierarchylevel;

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