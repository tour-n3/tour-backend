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
@Table(name = "traveler", schema = "dbo")
public class Traveler {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestId;

    @NotNull
    @Column(name = "representativeflag", nullable = false)
    private Boolean representativeFlag = false;

    @Size(max = 20)
    @Column(name = "familyname", length = 20)
    private String familyName;

    @Size(max = 20)
    @Column(name = "firstname", length = 20)
    private String firstName;

    @Size(max = 20)
    @Column(name = "familynamekana", length = 20)
    private String familyNameKana;

    @Size(max = 20)
    @Column(name = "firstnamekana", length = 20)
    private String firstNameKana;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "countrycode")
    private Integer countryCode;

    @NotNull
    @Column(name = "canspeakjapanese", nullable = false)
    private Boolean canSpeakJapanese = false;

    @Column(name = "dietaryrest", length = Integer.MAX_VALUE)
    private String dietaryRest;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

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
    @Column(name = "groupno", nullable = false)
    private Integer groupNo;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

    @Size(max = 20)
    @Column(name = "middlename", length = 20)
    private String middleName;

    @Size(max = 20)
    @Column(name = "middlenamekana", length = 20)
    private String middleNameKana;

    @Column(name = "birthday")
    private Instant birthday;

    @Size(max = 20)
    @Column(name = "tel", length = 20)
    private String tel;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellPhone;

    @Size(max = 200)
    @Column(name = "email", length = 200)
    private String email;

    @NotNull
    @Column(name = "vegetarianismflag", nullable = false)
    private Integer vegetarianismFlag;

    @NotNull
    @Column(name = "vegetarianismmeetflag", nullable = false)
    private Boolean vegetarianismMeetFlag = false;

    @NotNull
    @Column(name = "vegetarianismfishflag", nullable = false)
    private Boolean vegetarianismFishFlag = false;

    @NotNull
    @Column(name = "vegetarianismseafoodflag", nullable = false)
    private Boolean vegetarianismSeafoodFlag = false;

    @NotNull
    @Column(name = "vegetarianismbonitostockflag", nullable = false)
    private Boolean vegetarianismBonitoStockFlag = false;

    @NotNull
    @Column(name = "vegetarianismdairyproductsflag", nullable = false)
    private Boolean vegetarianismDairyProductsFlag = false;

    @NotNull
    @Column(name = "vegetarianismeggflag", nullable = false)
    private Boolean vegetarianismEggFlag = false;

    @NotNull
    @Column(name = "glutenfreeflag", nullable = false)
    private Integer glutenFreeFlag;

    @NotNull
    @Column(name = "glutenfreesoyproductsflag", nullable = false)
    private Integer glutenFreeSoyProductsFlag;

    @NotNull
    @Column(name = "allergyflag", nullable = false)
    private Integer allergyFlag;

    @Column(name = "allergyremarks", length = Integer.MAX_VALUE)
    private String allergyRemarks;

    @NotNull
    @Column(name = "dietaryrestflag", nullable = false)
    private Integer dietaryRestFlag;

    @NotNull
    @Column(name = "dietaryrestaflag", nullable = false)
    private Boolean dietaryRestAFlag = false;

    @NotNull
    @Column(name = "dietaryrestbflag", nullable = false)
    private Boolean dietaryRestBFlag = false;

    @NotNull
    @Column(name = "dietaryrestcflag", nullable = false)
    private Boolean dietaryRestCFlag = false;

    @NotNull
    @Column(name = "dietaryrestdflag", nullable = false)
    private Boolean dietaryRestDFlag = false;

    @NotNull
    @Column(name = "dietaryrestotherflag", nullable = false)
    private Boolean dietaryRestOtherFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "dammydataflag", nullable = false)
    private Boolean dummyDataFlag = false;

}
