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
@Table(name = "groupmailhistory", schema = "dbo")
public class Groupmailhistory {
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

    @Size(max = 130)
    @NotNull
    @Column(name = "subject", nullable = false, length = 130)
    private String subject;

    @NotNull
    @Column(name = "body", nullable = false, length = Integer.MAX_VALUE)
    private String body;

    @NotNull
    @Column(name = "immediateflag", nullable = false)
    private Boolean immediateflag = false;

    @NotNull
    @Column(name = "plandate", nullable = false)
    private Instant plandate;

    @Size(max = 100)
    @Column(name = "adminmemo", length = 100)
    private String adminmemo;

    @Column(name = "sendstartdate")
    private Instant sendstartdate;

    @Column(name = "sendenddate")
    private Instant sendenddate;

    @Size(max = 250)
    @NotNull
    @Column(name = "frommail", nullable = false, length = 250)
    private String frommail;

    @Size(max = 100)
    @NotNull
    @Column(name = "fromname", nullable = false, length = 100)
    private String fromname;

    @NotNull
    @Column(name = "sendcount", nullable = false)
    private Integer sendcount;

    @NotNull
    @Column(name = "sendresult", nullable = false)
    private Integer sendresult;

    @Size(max = 100)
    @Column(name = "attachment1", length = 100)
    private String attachment1;

    @Size(max = 100)
    @Column(name = "attachment2", length = 100)
    private String attachment2;

    @Size(max = 100)
    @Column(name = "attachment3", length = 100)
    private String attachment3;

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