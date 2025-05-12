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
@Table(name = "requestdetailolds", schema = "dbo")
public class RequestDetailOld {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "requestid")
    private Integer requestId;

    @Column(name = "requestdetailid")
    private Integer requestDetailId;

    @Column(name = "requestdate")
    private Instant requestDate;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planId;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String planNameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String planNameEn;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsId;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsNameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsNameEn;

    @Column(name = "modelcourseid")
    private Integer modelCourseId;

    @Column(name = "modelcoursename_ja", length = Integer.MAX_VALUE)
    private String modelCourseNameJa;

    @Column(name = "modelcoursename_en", length = Integer.MAX_VALUE)
    private String modelCourseNameEn;

    @Column(name = "classification")
    private Integer classification;

    @Column(name = "numbersadult")
    private Integer numbersAdult;

    @Column(name = "numberschild")
    private Integer numbersChild;

    @Column(name = "numbersbaby")
    private Integer numbersBaby;

    @NotNull
    @Column(name = "days", nullable = false)
    private Integer days;

    @NotNull
    @Column(name = "rooms", nullable = false)
    private Integer rooms;

    @Size(max = 10)
    @Column(name = "checkin", length = 10)
    private String checkIn;

    @Column(name = "roomtype", length = Integer.MAX_VALUE)
    private String roomType;

    @Column(name = "bedtype", length = Integer.MAX_VALUE)
    private String bedType;

    @Column(name = "bathtype", length = Integer.MAX_VALUE)
    private String bathType;

    @Column(name = "toilettype", length = Integer.MAX_VALUE)
    private String toiletType;

    @Column(name = "vegetarian", length = Integer.MAX_VALUE)
    private String vegetarian;

    @Column(name = "allergy", length = Integer.MAX_VALUE)
    private String allergy;

    @Column(name = "arrangementuserid", length = Integer.MAX_VALUE)
    private String arrangementUserId;

    @Column(name = "arrangementdate")
    private Instant arrangementDate;

    @Column(name = "arrangementmemo", length = Integer.MAX_VALUE)
    private String arrangementMemo;

    @NotNull
    @Column(name = "arrangementamount", nullable = false)
    private Integer arrangementAmount;

    @NotNull
    @Column(name = "arrangementstatus", nullable = false)
    private Integer arrangementStatus;

    @Column(name = "arrangementcomletedate")
    private Instant arrangementCompleteDate;

    @Column(name = "canceldate")
    private Instant cancelDate;

    @Column(name = "fixedpriceamount")
    private Integer fixedPriceAmount;

    @Column(name = "commissionrate")
    private Integer commissionRate;

    @Column(name = "cancelrate")
    private Integer cancelRate;

    @Column(name = "messagetocontents", length = Integer.MAX_VALUE)
    private String messageToContents;

    @Column(name = "retransmissiondate")
    private Instant retransmissionDate;

    @Column(name = "childmeal", length = Integer.MAX_VALUE)
    private String childMeal;

    @Column(name = "childbed", length = Integer.MAX_VALUE)
    private String childBed;

    @Column(name = "vegetariannum")
    private Integer vegetarianNum;

    @Column(name = "vegetariantype", length = Integer.MAX_VALUE)
    private String vegetarianType;

    @Column(name = "vegetariancannoteat", length = Integer.MAX_VALUE)
    private String vegetarianCannotEat;

    @Column(name = "allergynum")
    private Integer allergyNum;

    @Column(name = "allergycannoteat", length = Integer.MAX_VALUE)
    private String allergyCannotEat;

    @Column(name = "transportationselect", length = Integer.MAX_VALUE)
    private String transportationSelect;

    @Column(name = "transportationinformation", length = Integer.MAX_VALUE)
    private String transportationInformation;

    @Column(name = "pickuphope", length = Integer.MAX_VALUE)
    private String pickupHope;

    @Column(name = "pickupplacetime", length = Integer.MAX_VALUE)
    private String pickupPlaceTime;

    @Column(name = "konyamachiya", length = Integer.MAX_VALUE)
    private String konyaMachiya;

    @Column(name = "alternateaccommodations", length = Integer.MAX_VALUE)
    private String alternateAccommodations;

    @Column(name = "tourstarttimeselect", length = Integer.MAX_VALUE)
    private String tourStartTimeSelect;

    @Column(name = "daybeforeaccommodations", length = Integer.MAX_VALUE)
    private String dayBeforeAccommodations;

    @Column(name = "travelnumber")
    private Integer travelNumber;

    @Column(name = "travelpickuptime", length = Integer.MAX_VALUE)
    private String travelPickupTime;

    @Column(name = "rentalplace", length = Integer.MAX_VALUE)
    private String rentalPlace;

    @Column(name = "returnplace", length = Integer.MAX_VALUE)
    private String returnPlace;

    @Column(name = "cartype", length = Integer.MAX_VALUE)
    private String carType;

    @Column(name = "driverslicense", length = Integer.MAX_VALUE)
    private String driversLicense;

    @Column(name = "lunchboxdeliverytimenum")
    private Integer lunchboxDeliveryTimeNum;

    @Column(name = "lunchboxdeliverytime", length = Integer.MAX_VALUE)
    private String lunchboxDeliveryTime;

    @Column(name = "lunchboxdeliveryplace", length = Integer.MAX_VALUE)
    private String lunchboxDeliveryPlace;

    @Column(name = "lunchboxreceipttimenum")
    private Integer lunchboxReceiptTimeNum;

    @Column(name = "lunchboxreceipttime", length = Integer.MAX_VALUE)
    private String lunchboxReceiptTime;

    @Column(name = "rentalbicyclereturnplacenum")
    private Integer rentalBicycleReturnPlaceNum;

    @Column(name = "rentalbicyclereturnplace", length = Integer.MAX_VALUE)
    private String rentalBicycleReturnPlace;

    @Column(name = "taxistarttime", length = Integer.MAX_VALUE)
    private String taxiStartTime;

    @Column(name = "taxistartplace", length = Integer.MAX_VALUE)
    private String taxiStartPlace;

    @Column(name = "taxiendplace", length = Integer.MAX_VALUE)
    private String taxiEndPlace;

    @Column(name = "taxitype", length = Integer.MAX_VALUE)
    private String taxiType;

    @Column(name = "requirement", length = Integer.MAX_VALUE)
    private String requirement;

    @Column(name = "rentalstarttime", length = Integer.MAX_VALUE)
    private String rentalStartTime;

    @Column(name = "rentalenddate")
    private Instant rentalEndDate;

    @Column(name = "rentalendtime", length = Integer.MAX_VALUE)
    private String rentalEndTime;

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
    @ColumnDefault("0")
    @Column(name = "numbersadultmale", nullable = false)
    private Integer numbersAdultMale;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "numbersadultfemale", nullable = false)
    private Integer numbersAdultFemale;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "numbersbaby0to2", nullable = false)
    private Integer numbersBaby0To2;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "numbersbaby3to6", nullable = false)
    private Integer numbersBaby3To6;

}
