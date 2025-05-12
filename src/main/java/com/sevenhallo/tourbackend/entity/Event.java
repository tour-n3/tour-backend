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
@Table(name = "event", schema = "dbo")
public class Event {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "eventidstring", nullable = false, length = Integer.MAX_VALUE)
    private String eventIdString;

    @Column(name = "eventname_ja", length = Integer.MAX_VALUE)
    private String eventNameJa;

    @Column(name = "eventname_en", length = Integer.MAX_VALUE)
    private String eventNameEn;

    @NotNull
    @Column(name = "eventcode", nullable = false, length = Integer.MAX_VALUE)
    private String eventCode;

    @NotNull
    @Column(name = "eventenablestartdate", nullable = false)
    private Instant eventEnableStartDate;

    @NotNull
    @Column(name = "eventenableenddate", nullable = false)
    private Instant eventEnableEndDate;

    @Column(name = "organizername", length = Integer.MAX_VALUE)
    private String organizerName;

    @Column(name = "organizermail", length = Integer.MAX_VALUE)
    private String organizerMail;

    @Column(name = "organizerzip", length = Integer.MAX_VALUE)
    private String organizerZip;

    @Column(name = "organizeraddress", length = Integer.MAX_VALUE)
    private String organizerAddress;

    @Column(name = "organizertel", length = Integer.MAX_VALUE)
    private String organizerTel;

    @Column(name = "organizerfax", length = Integer.MAX_VALUE)
    private String organizerFax;

    @NotNull
    @Column(name = "stopflag", nullable = false)
    private Boolean stopFlag = false;

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
