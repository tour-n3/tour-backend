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
@Table(name = "request", schema = "dbo")
public class Request {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "requestno", length = Integer.MAX_VALUE)
    private String requestNo;

    @NotNull
    @Column(name = "requestserialno", nullable = false)
    private Integer requestSerialNo;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationUserId;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberId;

    @NotNull
    @Column(name = "requesttype", nullable = false)
    private Integer requestType;

    @NotNull
    @Column(name = "requeststatus", nullable = false)
    private Integer requestStatus;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @Column(name = "arrangementdate")
    private Instant arrangementDate;

    @Column(name = "settlementdate")
    private Instant settlementDate;

    @Column(name = "canceldate")
    private Instant cancelDate;

    @Size(max = 128)
    @Column(name = "adminapplicationuserid", length = 128)
    private String adminApplicationUserId;

    @NotNull
    @Column(name = "adminmemotype", nullable = false)
    private Integer adminMemoType;

    @Column(name = "adminmemo", length = Integer.MAX_VALUE)
    private String adminMemo;

    @Column(name = "questioncode", length = Integer.MAX_VALUE)
    private String questionCode;

    @Column(name = "questionnairesentdate")
    private Instant questionNaireSentDate;

    @NotNull
    @Column(name = "paymentcompletedcheckwaytype", nullable = false)
    private Integer paymentCompletedCheckWayType;

    @Size(max = 500)
    @Column(name = "paymentcompletednote", length = 500)
    private String paymentCompletedNote;

    @NotNull
    @Column(name = "arrangementcompletedcheckwaytype", nullable = false)
    private Integer arrangementCompletedCheckWayType;

    @Size(max = 500)
    @Column(name = "arrangementcompletednote", length = 500)
    private String arrangementCompletedNote;

    @NotNull
    @Column(name = "operationtype", nullable = false)
    private Integer operationType;

    @Column(name = "automessage", length = Integer.MAX_VALUE)
    private String autoMessage;

    @Column(name = "messagetomember", length = Integer.MAX_VALUE)
    private String messageToMember;

    @Column(name = "messagetochange", length = Integer.MAX_VALUE)
    private String messageToChange;

    @Column(name = "messagetocancel", length = Integer.MAX_VALUE)
    private String messageToCancel;

    @Column(name = "messagetoconfirmation", length = Integer.MAX_VALUE)
    private String messageToConfirmation;

    @NotNull
    @Column(name = "reservedpersontype", nullable = false)
    private Integer reservedPersonType;

    @NotNull
    @Column(name = "paymenttype", nullable = false)
    private Integer paymentType;

    @NotNull
    @Column(name = "agentpaymentconfirmtype", nullable = false)
    private Integer agentPaymentConfirmType;

    @Column(name = "agentpaymentdate")
    private Instant agentPaymentDate;

    @NotNull
    @Column(name = "publishertype", nullable = false)
    private Integer publisherType;

    @NotNull
    @Column(name = "cartflag", nullable = false)
    private Boolean cartFlag = false;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsNameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsNameEn;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String planNameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String planNameEn;

    @Column(name = "requestremarks", length = Integer.MAX_VALUE)
    private String requestRemarks;

    @Size(max = 32)
    @Column(name = "accessid", length = 32)
    private String accessId;

    @Size(max = 32)
    @Column(name = "accesspass", length = 32)
    private String accessPass;

    @NotNull
    @Column(name = "settlementamount", nullable = false)
    private Integer settlementAmount;

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

    @Column(name = "supplierremarkstype")
    private Integer supplierRemarksType;

    @Column(name = "supplierremarks", length = Integer.MAX_VALUE)
    private String supplierRemarks;

    @Column(name = "refarenceno", length = Integer.MAX_VALUE)
    private String refarenceNo;

    @Column(name = "agentremarkstype")
    private Integer agentRemarksType;

    @Column(name = "agentremarks", length = Integer.MAX_VALUE)
    private String agentRemarks;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "pricedetaildispflag", nullable = false)
    private Integer priceDetailDispFlag;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "invoicedispflg", nullable = false)
    private Integer invoiceDispFlg;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "paymentreminderagentsendflag", nullable = false)
    private Integer paymentReminderAgentSendFlag;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "travelerdispflg", nullable = false)
    private Integer travelerDispFlg;

    @NotNull
    @Column(name = "deposit", nullable = false)
    private Integer deposit;

    @NotNull
    @Column(name = "autocancel", nullable = false)
    private Boolean autocancel = false;

    @Column(name = "autocancellimit")
    private Instant autoCancelLimit;

    @Column(name = "adminmemoupdatedate")
    private Instant adminMemoUpdateDate;

    @Size(max = 128)
    @Column(name = "adminmemoupdateuserid", length = 128)
    private String adminMemoUpdateUserId;

}
