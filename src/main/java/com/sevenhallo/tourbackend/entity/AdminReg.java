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
public class AdminReg {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationUserId;

    @Column(name = "adminname_ja", length = Integer.MAX_VALUE)
    private String adminNameJa;

    @Column(name = "adminname_en", length = Integer.MAX_VALUE)
    private String adminNameEn;

    @NotNull
    @Column(name = "admintype", nullable = false)
    private Integer adminType;

    @NotNull
    @Column(name = "company", nullable = false)
    private Integer company;

    @Size(max = 100)
    @Column(name = "departmentname", length = 100)
    private String departmentName;

    @Size(max = 250)
    @NotNull
    @Column(name = "mail", nullable = false, length = 250)
    private String mail;

    @NotNull
    @Column(name = "imageid", nullable = false)
    private Integer imageId;

    @NotNull
    @Column(name = "contactimagedisplaysettinguser", nullable = false)
    private Boolean contactImageDisplaySettingUser = false;

    @NotNull
    @Column(name = "contactimagedisplaysettingsupplier", nullable = false)
    private Boolean contactImageDisplaySettingSupplier = false;

    @NotNull
    @Column(name = "contactimagedisplaysettingagent", nullable = false)
    private Boolean contactImageDisplaySettingAgent = false;

    @NotNull
    @Column(name = "contactimagedisplaysettingadmin", nullable = false)
    private Boolean contactImageDisplaySettingAdmin = false;

    @NotNull
    @Column(name = "delflag", nullable = false)
    private Boolean delFlag = false;

    @Size(max = 128)
    @Column(name = "updateapplicationuserid", length = 128)
    private String updateApplicationUserId;

    @NotNull
    @Column(name = "updatedate", nullable = false)
    private Instant updateDate;

    @NotNull
    @Column(name = "createdate", nullable = false)
    private Instant createDate;

    @Size(max = 250)
    @Column(name = "submail", length = 250)
    private String subMail;

}
