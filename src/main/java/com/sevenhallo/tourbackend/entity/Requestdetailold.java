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
public class Requestdetailold {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "requestid")
    private Integer requestid;

    @Column(name = "requestdetailid")
    private Integer requestdetailid;

    @Column(name = "requestdate")
    private Instant requestdate;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planid;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String plannameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String plannameEn;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsid;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsnameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsnameEn;

    @Column(name = "modelcourseid")
    private Integer modelcourseid;

    @Column(name = "modelcoursename_ja", length = Integer.MAX_VALUE)
    private String modelcoursenameJa;

    @Column(name = "modelcoursename_en", length = Integer.MAX_VALUE)
    private String modelcoursenameEn;

    @Column(name = "classification")
    private Integer classification;

    @Column(name = "numbersadult")
    private Integer numbersadult;

    @Column(name = "numberschild")
    private Integer numberschild;

    @Column(name = "numbersbaby")
    private Integer numbersbaby;

    @NotNull
    @Column(name = "days", nullable = false)
    private Integer days;

    @NotNull
    @Column(name = "rooms", nullable = false)
    private Integer rooms;

    @Size(max = 10)
    @Column(name = "checkin", length = 10)
    private String checkin;

    @Column(name = "roomtype", length = Integer.MAX_VALUE)
    private String roomtype;

    @Column(name = "bedtype", length = Integer.MAX_VALUE)
    private String bedtype;

    @Column(name = "bathtype", length = Integer.MAX_VALUE)
    private String bathtype;

    @Column(name = "toilettype", length = Integer.MAX_VALUE)
    private String toilettype;

    @Column(name = "vegetarian", length = Integer.MAX_VALUE)
    private String vegetarian;

    @Column(name = "allergy", length = Integer.MAX_VALUE)
    private String allergy;

    @Column(name = "arrangementuserid", length = Integer.MAX_VALUE)
    private String arrangementuserid;

    @Column(name = "arrangementdate")
    private Instant arrangementdate;

    @Column(name = "arrangementmemo", length = Integer.MAX_VALUE)
    private String arrangementmemo;

    @NotNull
    @Column(name = "arrangementamount", nullable = false)
    private Integer arrangementamount;

    @NotNull
    @Column(name = "arrangementstatus", nullable = false)
    private Integer arrangementstatus;

    @Column(name = "arrangementcomletedate")
    private Instant arrangementcomletedate;

    @Column(name = "canceldate")
    private Instant canceldate;

    @Column(name = "fixedpriceamount")
    private Integer fixedpriceamount;

    @Column(name = "commissionrate")
    private Integer commissionrate;

    @Column(name = "cancelrate")
    private Integer cancelrate;

    @Column(name = "messagetocontents", length = Integer.MAX_VALUE)
    private String messagetocontents;

    @Column(name = "retransmissiondate")
    private Instant retransmissiondate;

    @Column(name = "childmeal", length = Integer.MAX_VALUE)
    private String childmeal;

    @Column(name = "childbed", length = Integer.MAX_VALUE)
    private String childbed;

    @Column(name = "vegetariannum")
    private Integer vegetariannum;

    @Column(name = "vegetariantype", length = Integer.MAX_VALUE)
    private String vegetariantype;

    @Column(name = "vegetariancannoteat", length = Integer.MAX_VALUE)
    private String vegetariancannoteat;

    @Column(name = "allergynum")
    private Integer allergynum;

    @Column(name = "allergycannoteat", length = Integer.MAX_VALUE)
    private String allergycannoteat;

    @Column(name = "transportationselect", length = Integer.MAX_VALUE)
    private String transportationselect;

    @Column(name = "transportationinformation", length = Integer.MAX_VALUE)
    private String transportationinformation;

    @Column(name = "pickuphope", length = Integer.MAX_VALUE)
    private String pickuphope;

    @Column(name = "pickupplacetime", length = Integer.MAX_VALUE)
    private String pickupplacetime;

    @Column(name = "konyamachiya", length = Integer.MAX_VALUE)
    private String konyamachiya;

    @Column(name = "alternateaccommodations", length = Integer.MAX_VALUE)
    private String alternateaccommodations;

    @Column(name = "tourstarttimeselect", length = Integer.MAX_VALUE)
    private String tourstarttimeselect;

    @Column(name = "daybeforeaccommodations", length = Integer.MAX_VALUE)
    private String daybeforeaccommodations;

    @Column(name = "travelnumber")
    private Integer travelnumber;

    @Column(name = "travelpickuptime", length = Integer.MAX_VALUE)
    private String travelpickuptime;

    @Column(name = "rentalplace", length = Integer.MAX_VALUE)
    private String rentalplace;

    @Column(name = "returnplace", length = Integer.MAX_VALUE)
    private String returnplace;

    @Column(name = "cartype", length = Integer.MAX_VALUE)
    private String cartype;

    @Column(name = "driverslicense", length = Integer.MAX_VALUE)
    private String driverslicense;

    @Column(name = "lunchboxdeliverytimenum")
    private Integer lunchboxdeliverytimenum;

    @Column(name = "lunchboxdeliverytime", length = Integer.MAX_VALUE)
    private String lunchboxdeliverytime;

    @Column(name = "lunchboxdeliveryplace", length = Integer.MAX_VALUE)
    private String lunchboxdeliveryplace;

    @Column(name = "lunchboxreceipttimenum")
    private Integer lunchboxreceipttimenum;

    @Column(name = "lunchboxreceipttime", length = Integer.MAX_VALUE)
    private String lunchboxreceipttime;

    @Column(name = "rentalbicyclereturnplacenum")
    private Integer rentalbicyclereturnplacenum;

    @Column(name = "rentalbicyclereturnplace", length = Integer.MAX_VALUE)
    private String rentalbicyclereturnplace;

    @Column(name = "taxistarttime", length = Integer.MAX_VALUE)
    private String taxistarttime;

    @Column(name = "taxistartplace", length = Integer.MAX_VALUE)
    private String taxistartplace;

    @Column(name = "taxiendplace", length = Integer.MAX_VALUE)
    private String taxiendplace;

    @Column(name = "taxitype", length = Integer.MAX_VALUE)
    private String taxitype;

    @Column(name = "requirement", length = Integer.MAX_VALUE)
    private String requirement;

    @Column(name = "rentalstarttime", length = Integer.MAX_VALUE)
    private String rentalstarttime;

    @Column(name = "rentalenddate")
    private Instant rentalenddate;

    @Column(name = "rentalendtime", length = Integer.MAX_VALUE)
    private String rentalendtime;

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
    @ColumnDefault("0")
    @Column(name = "numbersadultmale", nullable = false)
    private Integer numbersadultmale;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "numbersadultfemale", nullable = false)
    private Integer numbersadultfemale;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "numbersbaby0to2", nullable = false)
    private Integer numbersbaby0to2;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "numbersbaby3to6", nullable = false)
    private Integer numbersbaby3to6;

}