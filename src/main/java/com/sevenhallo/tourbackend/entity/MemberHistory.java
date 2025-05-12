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
@Table(name = "memberhistory", schema = "dbo")
public class MemberHistory {
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

    @Size(max = 10)
    @Column(name = "displaymemberid", length = 10)
    private String displayMemberId;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationUserId;

    @Size(max = 20)
    @NotNull
    @Column(name = "familyname", nullable = false, length = 20)
    private String familyName;

    @Size(max = 20)
    @NotNull
    @Column(name = "firstname", nullable = false, length = 20)
    private String firstName;

    @Size(max = 20)
    @Column(name = "familynamekana", length = 20)
    private String familyNameKana;

    @Size(max = 20)
    @Column(name = "firstnamekana", length = 20)
    private String firstNameKana;

    @Column(name = "birthday")
    private Instant birthday;

    @Column(name = "sex")
    private Integer sex;

    @NotNull
    @Column(name = "countrycode", nullable = false)
    private Integer countryCode;

    @Size(max = 20)
    @NotNull
    @Column(name = "postcode", nullable = false, length = 20)
    private String postCode;

    @Size(max = 200)
    @NotNull
    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Size(max = 20)
    @NotNull
    @Column(name = "tel", nullable = false, length = 20)
    private String tel;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellPhone;

    @Size(max = 200)
    @NotNull
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @NotNull
    @Column(name = "canspeakjapanese", nullable = false)
    private Boolean canSpeakJapanese = false;

    @NotNull
    @Column(name = "onetime", nullable = false)
    private Boolean oneTime = false;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @NotNull
    @Column(name = "applicationroletype", nullable = false)
    private Integer applicationRoleType;

    @Size(max = 10)
    @Column(name = "agentcode", length = 10)
    private String agentCode;

    @NotNull
    @Column(name = "sendmailpaymentflag", nullable = false)
    private Integer sendMailPaymentFlag;

    @Size(max = 20)
    @Column(name = "fax", length = 20)
    private String fax;

    @NotNull
    @Column(name = "stopuseflag", nullable = false)
    private Boolean stopUseFlag = false;

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

    @Column(name = "branchname_ja", length = Integer.MAX_VALUE)
    private String branchNameJa;

    @Column(name = "branchname_en", length = Integer.MAX_VALUE)
    private String branchNameEn;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @Column(name = "vegetarianismflag")
    private Integer vegetarianismFlag;

    @Column(name = "vegetarianismmeetflag")
    private Boolean vegetarianismMeetFlag;

    @Column(name = "vegetarianismfishflag")
    private Boolean vegetarianismFishFlag;

    @Column(name = "vegetarianismseafoodflag")
    private Boolean vegetarianismSeafoodFlag;

    @Column(name = "vegetarianismbonitostockflag")
    private Boolean vegetarianismBonitoStockFlag;

    @Column(name = "vegetarianismdairyproductsflag")
    private Boolean vegetarianismDairyProductsFlag;

    @Column(name = "vegetarianismeggflag")
    private Boolean vegetarianismEggFlag;

    @Column(name = "glutenfreeflag")
    private Integer glutenFreeFlag;

    @Column(name = "glutenfreesoyproductsflag")
    private Integer glutenFreeSoyProductsFlag;

    @Column(name = "allergyflag")
    private Integer allergyFlag;

    @Column(name = "allergyremarks", length = Integer.MAX_VALUE)
    private String allergyRemarks;

    @Column(name = "dietaryrestflag")
    private Integer dietaryRestFlag;

    @Column(name = "dietaryrestaflag")
    private Boolean dietaryRestAFlag;

    @Column(name = "dietaryrestbflag")
    private Boolean dietaryRestBFlag;

    @Column(name = "dietaryrestcflag")
    private Boolean dietaryRestCFlag;

    @Column(name = "dietaryrestdflag")
    private Boolean dietaryRestDFlag;

    @Column(name = "dietaryrestotherflag")
    private Boolean dietaryRestOtherFlag;

    @Column(name = "dietaryrest", length = Integer.MAX_VALUE)
    private String dietaryRest;

    @Size(max = 20)
    @Column(name = "middlename", length = 20)
    private String middleName;

    @Size(max = 20)
    @Column(name = "middlenamekana", length = 20)
    private String middleNameKana;

}
