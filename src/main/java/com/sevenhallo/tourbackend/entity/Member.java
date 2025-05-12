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
@Table(name = "member", schema = "dbo")
public class Member {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @Column(name = "displayMemberId", length = 10)
    private String displayMemberId;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationUserId", nullable = false, length = 128)
    private String applicationUserId;

    @Size(max = 20)
    @NotNull
    @Column(name = "familyName", nullable = false, length = 20)
    private String familyName;

    @Size(max = 20)
    @NotNull
    @Column(name = "firstName", nullable = false, length = 20)
    private String firstName;

    @Size(max = 20)
    @Column(name = "familyNameKana", length = 20)
    private String familyNameKana;

    @Size(max = 20)
    @Column(name = "firstNameKana", length = 20)
    private String firstNameKana;

    @Column(name = "birthday")
    private Instant birthday;

    @Column(name = "sex")
    private Integer sex;

    @NotNull
    @Column(name = "countryCode", nullable = false)
    private Integer countryCode;

    @Size(max = 20)
    @NotNull
    @Column(name = "postCode", nullable = false, length = 20)
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
    @Column(name = "cellPhone", length = 20)
    private String cellPhone;

    @Size(max = 200)
    @NotNull
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @NotNull
    @Column(name = "canSpeakJapanese", nullable = false)
    private Boolean canSpeakJapanese = false;

    @NotNull
    @Column(name = "oneTime", nullable = false)
    private Boolean oneTime = false;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @NotNull
    @Column(name = "applicationRoleType", nullable = false)
    private Integer applicationRoleType;

    @Size(max = 10)
    @Column(name = "agentCode", length = 10)
    private String agentCode;

    @NotNull
    @Column(name = "sendMailPaymentFlag", nullable = false)
    private Integer sendMailPaymentFlag;

    @Size(max = 20)
    @Column(name = "fax", length = 20)
    private String fax;

    @NotNull
    @Column(name = "stopUseFlag", nullable = false)
    private Boolean stopUseFlag = false;

    @NotNull
    @Column(name = "delFlag", nullable = false)
    private Boolean delFlag = false;

    @Size(max = 128)
    @Column(name = "updateApplicationUserId", length = 128)
    private String updateApplicationUserId;

    @NotNull
    @Column(name = "updateDate", nullable = false)
    private Instant updateDate;

    @NotNull
    @Column(name = "createDate", nullable = false)
    private Instant createDate;

    @Column(name = "branchNameJa", length = Integer.MAX_VALUE)
    private String branchNameJa;

    @Column(name = "branchNameEn", length = Integer.MAX_VALUE)
    private String branchNameEn;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @Column(name = "vegetarianismFlag")
    private Integer vegetarianismFlag;

    @Column(name = "vegetarianismMeetFlag")
    private Boolean vegetarianismMeetFlag;

    @Column(name = "vegetarianismFishFlag")
    private Boolean vegetarianismFishFlag;

    @Column(name = "vegetarianismSeafoodFlag")
    private Boolean vegetarianismSeafoodFlag;

    @Column(name = "vegetarianismBonitoStockFlag")
    private Boolean vegetarianismBonitoStockFlag;

    @Column(name = "vegetarianismDairyProductsFlag")
    private Boolean vegetarianismDairyProductsFlag;

    @Column(name = "vegetarianismEggFlag")
    private Boolean vegetarianismEggFlag;

    @Column(name = "glutenFreeFlag")
    private Integer glutenFreeFlag;

    @Column(name = "glutenFreeSoyProductsFlag")
    private Integer glutenFreeSoyProductsFlag;

    @Column(name = "allergyFlag")
    private Integer allergyFlag;

    @Column(name = "allergyRemarks", length = Integer.MAX_VALUE)
    private String allergyRemarks;

    @Column(name = "dietaryRestFlag")
    private Integer dietaryRestFlag;

    @Column(name = "dietaryRestAFlag")
    private Boolean dietaryRestAFlag;

    @Column(name = "dietaryRestBFlag")
    private Boolean dietaryRestBFlag;

    @Column(name = "dietaryRestCFlag")
    private Boolean dietaryRestCFlag;

    @Column(name = "dietaryRestDFlag")
    private Boolean dietaryRestDFlag;

    @Column(name = "dietaryRestOtherFlag")
    private Boolean dietaryRestOtherFlag;

    @Column(name = "dietaryRest", length = Integer.MAX_VALUE)
    private String dietaryRest;

    @Size(max = 20)
    @Column(name = "middleName", length = 20)
    private String middleName;

    @Size(max = 20)
    @Column(name = "middleNameKana", length = 20)
    private String middleNameKana;

}
