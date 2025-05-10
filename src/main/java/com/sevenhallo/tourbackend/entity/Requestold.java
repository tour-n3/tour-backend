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
@Table(name = "requestolds", schema = "dbo")
public class Requestold {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

    @NotNull
    @Column(name = "requeststatus", nullable = false)
    private Integer requeststatus;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @Column(name = "requestdate")
    private Instant requestdate;

    @Column(name = "arrangementdate")
    private Instant arrangementdate;

    @Column(name = "settlementdate")
    private Instant settlementdate;

    @Column(name = "canceldate")
    private Instant canceldate;

    @Column(name = "userid", length = Integer.MAX_VALUE)
    private String userid;

    @Column(name = "usermemo", length = Integer.MAX_VALUE)
    private String usermemo;

    @Column(name = "questionnairekey", length = Integer.MAX_VALUE)
    private String questionnairekey;

    @Column(name = "questionnairesentdate")
    private Instant questionnairesentdate;

    @Column(name = "messagetomember", length = Integer.MAX_VALUE)
    private String messagetomember;

    @Column(name = "messagetochange", length = Integer.MAX_VALUE)
    private String messagetochange;

    @Column(name = "messagetocancel", length = Integer.MAX_VALUE)
    private String messagetocancel;

    @Column(name = "messagetoconfirmation", length = Integer.MAX_VALUE)
    private String messagetoconfirmation;

    @Column(name = "paymentremindersentdate")
    private Instant paymentremindersentdate;

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