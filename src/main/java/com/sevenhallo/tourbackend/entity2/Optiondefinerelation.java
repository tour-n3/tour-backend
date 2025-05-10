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
@Table(name = "optiondefinerelation", schema = "dbo")
public class Optiondefinerelation {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "optionformid", nullable = false)
    private Integer optionformid;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optiondefineid;

    @NotNull
    @Column(name = "optiondefineorder", nullable = false)
    private Integer optiondefineorder;

    @Column(name = "parentoptiondefinerelationid")
    private Integer parentoptiondefinerelationid;

    @Column(name = "parentoptiondefineelmid", length = Integer.MAX_VALUE)
    private String parentoptiondefineelmid;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

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