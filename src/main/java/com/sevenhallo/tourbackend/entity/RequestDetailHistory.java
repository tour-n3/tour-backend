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
@Table(name = "requestdetailhistory", schema = "dbo")
public class RequestDetailHistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "historydata_targethistoryid", nullable = false)
    private Integer historyDataTargetHistoryId;

    @NotNull
    @Column(name = "historydata_enablestartdate", nullable = false)
    private Instant historyDataEnableStartDate;

    @Column(name = "historydata_enableenddate")
    private Instant historyDataEnableEndDate;

    @Column(name = "historyextension_remarkshistory", length = Integer.MAX_VALUE)
    private String historyExtensionRemarksHistory;

    @Column(name = "requestid")
    private Integer requestId;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsId;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsNameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsNameEn;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planId;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String planNameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String planNameEn;

    @Column(name = "contentsdetailtypeid")
    private Integer contentsDetailTypeId;

    @Column(name = "modelcourseid")
    private Integer modelCourseId;

    @Column(name = "modelcoursename_ja", length = Integer.MAX_VALUE)
    private String modelCourseNameJa;

    @Column(name = "modelcoursename_en", length = Integer.MAX_VALUE)
    private String modelCourseNameEn;

    @Column(name = "usestartdate")
    private Instant useStartDate;

    @Column(name = "useenddate")
    private Instant useEndDate;

    @NotNull
    @Column(name = "days", nullable = false)
    private Integer days;

    @NotNull
    @Column(name = "rooms", nullable = false)
    private Integer rooms;

    @Size(max = 10)
    @Column(name = "checkin", length = 10)
    private String checkIn;

    @NotNull
    @Column(name = "arrangementstatus", nullable = false)
    private Integer arrangementStatus;

    @NotNull
    @Column(name = "arrangementstatuscheckwaytype", nullable = false)
    private Integer arrangementStatusCheckWayType;

    @Column(name = "arrangementnote", length = Integer.MAX_VALUE)
    private String arrangementNote;

    @Column(name = "arrangementdate")
    private Instant arrangementDate;

    @Column(name = "canceldate")
    private Instant cancelDate;

    @NotNull
    @Column(name = "operationtype", nullable = false)
    private Integer operationType;

    @NotNull
    @Column(name = "previouslyused", nullable = false)
    private Boolean previouslyUsed = false;

    @Column(name = "baggageclaimcontentsid")
    private Integer baggageClaimContentsId;

    @Column(name = "baggageclaimnumber")
    private Integer baggageClaimNumber;

    @Column(name = "baggageclaimdate")
    private Instant baggageClaimDate;

    @Column(name = "luggagedeliverycontentsid")
    private Integer luggageDeliveryContentsId;

    @Column(name = "luggagedeliverynumber")
    private Integer luggageDeliveryNumber;

    @Column(name = "luggagedeliverydate")
    private Instant luggageDeliveryDate;

    @Column(name = "lunchboxdeliverycontentsid")
    private Integer lunchboxDeliveryContentsId;

    @Column(name = "lunchboxdeliverynumber")
    private Integer lunchboxDeliveryNumber;

    @Column(name = "lunchboxdeliverydate")
    private Instant lunchboxDeliveryDate;

    @Column(name = "conditionremaks", length = Integer.MAX_VALUE)
    private String conditionRemaks;

    @Column(name = "otherprice1")
    private Integer otherPrice1;

    @Column(name = "otherpayment1")
    private Integer otherPayment1;

    @Column(name = "otherprice1name", length = Integer.MAX_VALUE)
    private String otherPrice1Name;

    @Column(name = "otherprice2")
    private Integer otherPrice2;

    @Column(name = "otherpayment2")
    private Integer otherPayment2;

    @Column(name = "otherprice2name", length = Integer.MAX_VALUE)
    private String otherPrice2Name;

    @Column(name = "otherprice3")
    private Integer otherPrice3;

    @Column(name = "otherpayment3")
    private Integer otherPayment3;

    @Column(name = "otherprice3name", length = Integer.MAX_VALUE)
    private String otherPrice3Name;

    @Column(name = "suppliermessage", length = Integer.MAX_VALUE)
    private String supplierMessage;

    @Column(name = "membermessage", length = Integer.MAX_VALUE)
    private String memberMessage;

    @NotNull
    @Column(name = "cartflag", nullable = false)
    private Boolean cartFlag = false;

    @NotNull
    @Column(name = "applicationnumber", nullable = false)
    private Integer applicationNumber;

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

    @NotNull
    @ColumnDefault("false")
    @Column(name = "modelcourseflag", nullable = false)
    private Boolean modelCourseFlag = false;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "approvalstatus", nullable = false)
    private Integer approvalStatus;

    @Column(name = "approvaldate")
    private Instant approvalDate;

    @Column(name = "reservationconfirmeddate")
    private Instant reservationConfirmedDate;

    @Column(name = "cancelconfirmeddate")
    private Instant cancelConfirmedDate;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "baggageclaimhideflag", nullable = false)
    private Boolean baggageClaimHideFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "luggagedeliveryhideflag", nullable = false)
    private Boolean luggageDeliveryHideFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "lunchboxhideflag", nullable = false)
    private Boolean lunchboxHideFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "otherprice1visible", nullable = false)
    private Boolean otherPrice1Visible = false;

    @Column(name = "otherprice1datetime")
    private Instant otherPrice1DateTime;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "otherprice2visible", nullable = false)
    private Boolean otherPrice2Visible = false;

    @Column(name = "otherprice2datetime")
    private Instant otherPrice2DateTime;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "otherprice3visible", nullable = false)
    private Boolean otherPrice3Visible = false;

    @Column(name = "otherprice3datetime")
    private Instant otherPrice3DateTime;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "isticketdownloadallowed", nullable = false)
    private Boolean isTicketDownloadAllowed = false;

    @Column(name = "ticketmemo", length = Integer.MAX_VALUE)
    private String ticketMemo;

    @Column(name = "sendfaxdatetime")
    private Instant sendFaxDateTime;

    @Column(name = "reasonrejection")
    private Integer reasonRejection;

}
