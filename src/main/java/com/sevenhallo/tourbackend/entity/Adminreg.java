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
@Table(name = "adminreg", schema = "dbo")
public class Adminreg {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationuserid;

    @Column(name = "adminname_ja", length = Integer.MAX_VALUE)
    private String adminnameJa;

    @Column(name = "adminname_en", length = Integer.MAX_VALUE)
    private String adminnameEn;

    @NotNull
    @Column(name = "admintype", nullable = false)
    private Integer admintype;

    @NotNull
    @Column(name = "company", nullable = false)
    private Integer company;

    @Size(max = 100)
    @Column(name = "departmentname", length = 100)
    private String departmentname;

    @Size(max = 250)
    @NotNull
    @Column(name = "mail", nullable = false, length = 250)
    private String mail;

    @NotNull
    @Column(name = "imageid", nullable = false)
    private Integer imageid;

    @NotNull
    @Column(name = "contactimagedisplaysettinguser", nullable = false)
    private Boolean contactimagedisplaysettinguser = false;

    @NotNull
    @Column(name = "contactimagedisplaysettingsupplier", nullable = false)
    private Boolean contactimagedisplaysettingsupplier = false;

    @NotNull
    @Column(name = "contactimagedisplaysettingagent", nullable = false)
    private Boolean contactimagedisplaysettingagent = false;

    @NotNull
    @Column(name = "contactimagedisplaysettingadmin", nullable = false)
    private Boolean contactimagedisplaysettingadmin = false;

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

    @Size(max = 250)
    @Column(name = "submail", length = 250)
    private String submail;

}