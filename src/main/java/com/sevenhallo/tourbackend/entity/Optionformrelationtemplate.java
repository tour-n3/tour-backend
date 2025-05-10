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
@Table(name = "optionformrelationtemplate", schema = "dbo")
public class Optionformrelationtemplate {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "optiontabid", nullable = false)
    private Integer optiontabid;

    @NotNull
    @Column(name = "optionformid", nullable = false)
    private Integer optionformid;

    @NotNull
    @Column(name = "optionformorder", nullable = false)
    private Integer optionformorder;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Boolean visibleflag = false;

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
    @Column(name = "suppliervisibleflag", nullable = false)
    private Boolean suppliervisibleflag = false;

}