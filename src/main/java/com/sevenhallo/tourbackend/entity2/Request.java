package com.sevenhallo.tourbackend.entity2;

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
    private String requestno;

    @NotNull
    @Column(name = "requestserialno", nullable = false)
    private Integer requestserialno;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationuserid;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @NotNull
    @Column(name = "requesttype", nullable = false)
    private Integer requesttype;

    @NotNull
    @Column(name = "requeststatus", nullable = false)
    private Integer requeststatus;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @Column(name = "arrangementdate")
    private Instant arrangementdate;

    @Column(name = "settlementdate")
    private Instant settlementdate;

    @Column(name = "canceldate")
    private Instant canceldate;

    @Size(max = 128)
    @Column(name = "adminapplicationuserid", length = 128)
    private String adminapplicationuserid;

    @NotNull
    @Column(name = "adminmemotype", nullable = false)
    private Integer adminmemotype;

    @Column(name = "adminmemo", length = Integer.MAX_VALUE)
    private String adminmemo;

    @Column(name = "questioncode", length = Integer.MAX_VALUE)
    private String questioncode;

    @Column(name = "questionnairesentdate")
    private Instant questionnairesentdate;

    @NotNull
    @Column(name = "paymentcompletedcheckwaytype", nullable = false)
    private Integer paymentcompletedcheckwaytype;

    @Size(max = 500)
    @Column(name = "paymentcompletednote", length = 500)
    private String paymentcompletednote;

    @NotNull
    @Column(name = "arrangementcompletedcheckwaytype", nullable = false)
    private Integer arrangementcompletedcheckwaytype;

    @Size(max = 500)
    @Column(name = "arrangementcompletednote", length = 500)
    private String arrangementcompletednote;

    @NotNull
    @Column(name = "operationtype", nullable = false)
    private Integer operationtype;

    @Column(name = "automessage", length = Integer.MAX_VALUE)
    private String automessage;

    @Column(name = "messagetomember", length = Integer.MAX_VALUE)
    private String messagetomember;

    @Column(name = "messagetochange", length = Integer.MAX_VALUE)
    private String messagetochange;

    @Column(name = "messagetocancel", length = Integer.MAX_VALUE)
    private String messagetocancel;

    @Column(name = "messagetoconfirmation", length = Integer.MAX_VALUE)
    private String messagetoconfirmation;

    @NotNull
    @Column(name = "reservedpersontype", nullable = false)
    private Integer reservedpersontype;

    @NotNull
    @Column(name = "paymenttype", nullable = false)
    private Integer paymenttype;

    @NotNull
    @Column(name = "agentpaymentconfirmtype", nullable = false)
    private Integer agentpaymentconfirmtype;

    @Column(name = "agentpaymentdate")
    private Instant agentpaymentdate;

    @NotNull
    @Column(name = "publishertype", nullable = false)
    private Integer publishertype;

    @NotNull
    @Column(name = "cartflag", nullable = false)
    private Boolean cartflag = false;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsnameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsnameEn;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String plannameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String plannameEn;

    @Column(name = "requestremarks", length = Integer.MAX_VALUE)
    private String requestremarks;

    @Size(max = 32)
    @Column(name = "accessid", length = 32)
    private String accessid;

    @Size(max = 32)
    @Column(name = "accesspass", length = 32)
    private String accesspass;

    @NotNull
    @Column(name = "settlementamount", nullable = false)
    private Integer settlementamount;

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

    @Column(name = "supplierremarkstype")
    private Integer supplierremarkstype;

    @Column(name = "supplierremarks", length = Integer.MAX_VALUE)
    private String supplierremarks;

    @Column(name = "refarenceno", length = Integer.MAX_VALUE)
    private String refarenceno;

    @Column(name = "agentremarkstype")
    private Integer agentremarkstype;

    @Column(name = "agentremarks", length = Integer.MAX_VALUE)
    private String agentremarks;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "pricedetaildispflag", nullable = false)
    private Integer pricedetaildispflag;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "invoicedispflg", nullable = false)
    private Integer invoicedispflg;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "paymentreminderagentsendflag", nullable = false)
    private Integer paymentreminderagentsendflag;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "travelerdispflg", nullable = false)
    private Integer travelerdispflg;

    @NotNull
    @Column(name = "deposit", nullable = false)
    private Integer deposit;

    @NotNull
    @Column(name = "autocancel", nullable = false)
    private Boolean autocancel = false;

    @Column(name = "autocancellimit")
    private Instant autocancellimit;

    @Column(name = "adminmemoupdatedate")
    private Instant adminmemoupdatedate;

    @Size(max = 128)
    @Column(name = "adminmemoupdateuserid", length = 128)
    private String adminmemoupdateuserid;

}