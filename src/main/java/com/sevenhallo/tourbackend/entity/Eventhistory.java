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
@Table(name = "eventhistory", schema = "dbo")
public class Eventhistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "historydata_targethistoryid", nullable = false)
    private Integer historydataTargethistoryid;

    @NotNull
    @Column(name = "historydata_enablestartdate", nullable = false)
    private Instant historydataEnablestartdate;

    @Column(name = "historydata_enableenddate")
    private Instant historydataEnableenddate;

    @NotNull
    @Column(name = "eventidstring", nullable = false, length = Integer.MAX_VALUE)
    private String eventidstring;

    @Column(name = "eventname_ja", length = Integer.MAX_VALUE)
    private String eventnameJa;

    @Column(name = "eventname_en", length = Integer.MAX_VALUE)
    private String eventnameEn;

    @NotNull
    @Column(name = "eventcode", nullable = false, length = Integer.MAX_VALUE)
    private String eventcode;

    @NotNull
    @Column(name = "eventenablestartdate", nullable = false)
    private Instant eventenablestartdate;

    @NotNull
    @Column(name = "eventenableenddate", nullable = false)
    private Instant eventenableenddate;

    @Column(name = "organizername", length = Integer.MAX_VALUE)
    private String organizername;

    @Column(name = "organizermail", length = Integer.MAX_VALUE)
    private String organizermail;

    @Column(name = "organizerzip", length = Integer.MAX_VALUE)
    private String organizerzip;

    @Column(name = "organizeraddress", length = Integer.MAX_VALUE)
    private String organizeraddress;

    @Column(name = "organizertel", length = Integer.MAX_VALUE)
    private String organizertel;

    @Column(name = "organizerfax", length = Integer.MAX_VALUE)
    private String organizerfax;

    @NotNull
    @Column(name = "stopflag", nullable = false)
    private Boolean stopflag = false;

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