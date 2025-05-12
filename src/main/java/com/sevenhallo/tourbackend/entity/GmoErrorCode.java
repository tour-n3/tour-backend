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
@Table(name = "gmoerrorcode", schema = "dbo")
public class GmoErrorCode {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 4)
    @Column(name = "no", length = 4)
    private String no;

    @Column(name = "errcode", length = Integer.MAX_VALUE)
    private String errCode;

    @Column(name = "errinfo", length = Integer.MAX_VALUE)
    private String errInfo;

    @Column(name = "other1", length = Integer.MAX_VALUE)
    private String other1;

    @Column(name = "other2", length = Integer.MAX_VALUE)
    private String other2;

    @Column(name = "other3", length = Integer.MAX_VALUE)
    private String other3;

    @Column(name = "message_ja", length = Integer.MAX_VALUE)
    private String messageJa;

    @Column(name = "message_en", length = Integer.MAX_VALUE)
    private String messageEn;

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

}
