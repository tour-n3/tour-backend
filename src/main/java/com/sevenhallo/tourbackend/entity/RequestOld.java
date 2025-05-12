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
public class RequestOld {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestId;

    @NotNull
    @Column(name = "requeststatus", nullable = false)
    private Integer requestStatus;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberId;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @Column(name = "requestdate")
    private Instant requestDate;

    @Column(name = "arrangementdate")
    private Instant arrangementDate;

    @Column(name = "settlementdate")
    private Instant settlementDate;

    @Column(name = "canceldate")
    private Instant cancelDate;

    @Column(name = "userid", length = Integer.MAX_VALUE)
    private String userId;

    @Column(name = "usermemo", length = Integer.MAX_VALUE)
    private String userMemo;

    @Column(name = "questionnairekey", length = Integer.MAX_VALUE)
    private String questionnaireKey;

    @Column(name = "questionnairesentdate")
    private Instant questionNaireSentDate;

    @Column(name = "messagetomember", length = Integer.MAX_VALUE)
    private String messageToMember;

    @Column(name = "messagetochange", length = Integer.MAX_VALUE)
    private String messageToChange;

    @Column(name = "messagetocancel", length = Integer.MAX_VALUE)
    private String messageToCancel;

    @Column(name = "messagetoconfirmation", length = Integer.MAX_VALUE)
    private String messageToConfirmation;

    @Column(name = "paymentremindersentdate")
    private Instant paymentReminderSentDate;

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
