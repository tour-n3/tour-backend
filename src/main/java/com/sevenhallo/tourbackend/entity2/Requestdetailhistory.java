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
@Table(name = "requestdetailhistory", schema = "dbo")
public class Requestdetailhistory {
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

    @Column(name = "historyextension_remarkshistory", length = Integer.MAX_VALUE)
    private String historyextensionRemarkshistory;

    @Column(name = "requestid")
    private Integer requestid;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsid;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsnameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsnameEn;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planid;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String plannameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String plannameEn;

    @Column(name = "contentsdetailtypeid")
    private Integer contentsdetailtypeid;

    @Column(name = "modelcourseid")
    private Integer modelcourseid;

    @Column(name = "modelcoursename_ja", length = Integer.MAX_VALUE)
    private String modelcoursenameJa;

    @Column(name = "modelcoursename_en", length = Integer.MAX_VALUE)
    private String modelcoursenameEn;

    @Column(name = "usestartdate")
    private Instant usestartdate;

    @Column(name = "useenddate")
    private Instant useenddate;

    @NotNull
    @Column(name = "days", nullable = false)
    private Integer days;

    @NotNull
    @Column(name = "rooms", nullable = false)
    private Integer rooms;

    @Size(max = 10)
    @Column(name = "checkin", length = 10)
    private String checkin;

    @NotNull
    @Column(name = "arrangementstatus", nullable = false)
    private Integer arrangementstatus;

    @NotNull
    @Column(name = "arrangementstatuscheckwaytype", nullable = false)
    private Integer arrangementstatuscheckwaytype;

    @Column(name = "arrangementnote", length = Integer.MAX_VALUE)
    private String arrangementnote;

    @Column(name = "arrangementdate")
    private Instant arrangementdate;

    @Column(name = "canceldate")
    private Instant canceldate;

    @NotNull
    @Column(name = "operationtype", nullable = false)
    private Integer operationtype;

    @NotNull
    @Column(name = "previouslyused", nullable = false)
    private Boolean previouslyused = false;

    @Column(name = "baggageclaimcontentsid")
    private Integer baggageclaimcontentsid;

    @Column(name = "baggageclaimnumber")
    private Integer baggageclaimnumber;

    @Column(name = "baggageclaimdate")
    private Instant baggageclaimdate;

    @Column(name = "luggagedeliverycontentsid")
    private Integer luggagedeliverycontentsid;

    @Column(name = "luggagedeliverynumber")
    private Integer luggagedeliverynumber;

    @Column(name = "luggagedeliverydate")
    private Instant luggagedeliverydate;

    @Column(name = "lunchboxdeliverycontentsid")
    private Integer lunchboxdeliverycontentsid;

    @Column(name = "lunchboxdeliverynumber")
    private Integer lunchboxdeliverynumber;

    @Column(name = "lunchboxdeliverydate")
    private Instant lunchboxdeliverydate;

    @Column(name = "conditionremaks", length = Integer.MAX_VALUE)
    private String conditionremaks;

    @Column(name = "otherprice1")
    private Integer otherprice1;

    @Column(name = "otherpayment1")
    private Integer otherpayment1;

    @Column(name = "otherprice1name", length = Integer.MAX_VALUE)
    private String otherprice1name;

    @Column(name = "otherprice2")
    private Integer otherprice2;

    @Column(name = "otherpayment2")
    private Integer otherpayment2;

    @Column(name = "otherprice2name", length = Integer.MAX_VALUE)
    private String otherprice2name;

    @Column(name = "otherprice3")
    private Integer otherprice3;

    @Column(name = "otherpayment3")
    private Integer otherpayment3;

    @Column(name = "otherprice3name", length = Integer.MAX_VALUE)
    private String otherprice3name;

    @Column(name = "suppliermessage", length = Integer.MAX_VALUE)
    private String suppliermessage;

    @Column(name = "membermessage", length = Integer.MAX_VALUE)
    private String membermessage;

    @NotNull
    @Column(name = "cartflag", nullable = false)
    private Boolean cartflag = false;

    @NotNull
    @Column(name = "applicationnumber", nullable = false)
    private Integer applicationnumber;

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

    @NotNull
    @ColumnDefault("false")
    @Column(name = "modelcourseflag", nullable = false)
    private Boolean modelcourseflag = false;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "approvalstatus", nullable = false)
    private Integer approvalstatus;

    @Column(name = "approvaldate")
    private Instant approvaldate;

    @Column(name = "reservationconfirmeddate")
    private Instant reservationconfirmeddate;

    @Column(name = "cancelconfirmeddate")
    private Instant cancelconfirmeddate;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "baggageclaimhideflag", nullable = false)
    private Boolean baggageclaimhideflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "luggagedeliveryhideflag", nullable = false)
    private Boolean luggagedeliveryhideflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "lunchboxhideflag", nullable = false)
    private Boolean lunchboxhideflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "otherprice1visible", nullable = false)
    private Boolean otherprice1visible = false;

    @Column(name = "otherprice1datetime")
    private Instant otherprice1datetime;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "otherprice2visible", nullable = false)
    private Boolean otherprice2visible = false;

    @Column(name = "otherprice2datetime")
    private Instant otherprice2datetime;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "otherprice3visible", nullable = false)
    private Boolean otherprice3visible = false;

    @Column(name = "otherprice3datetime")
    private Instant otherprice3datetime;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "isticketdownloadallowed", nullable = false)
    private Boolean isticketdownloadallowed = false;

    @Column(name = "ticketmemo", length = Integer.MAX_VALUE)
    private String ticketmemo;

    @Column(name = "sendfaxdatetime")
    private Instant sendfaxdatetime;

    @Column(name = "reasonrejection")
    private Integer reasonrejection;

}