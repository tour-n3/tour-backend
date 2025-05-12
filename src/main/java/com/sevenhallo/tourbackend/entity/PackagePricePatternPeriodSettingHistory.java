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
@Table(name = "packagepricepatternperiodsettinghistory", schema = "dbo")
public class PackagePricePatternPeriodSettingHistory {
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

    @NotNull
    @Column(name = "packageid", nullable = false)
    private Integer packageId;

    @NotNull
    @Column(name = "contentsdetailtypeid", nullable = false)
    private Integer contentsDetailTypeId;

    @NotNull
    @Column(name = "mondaycheck", nullable = false)
    private Boolean mondayCheck = false;

    @Column(name = "mondaypricepatternid")
    private Integer mondayPricePatternId;

    @NotNull
    @Column(name = "tuesdaycheck", nullable = false)
    private Boolean tuesdayCheck = false;

    @Column(name = "tuesdaypricepatternid")
    private Integer tuesdayPricePatternId;

    @NotNull
    @Column(name = "wednesdaycheck", nullable = false)
    private Boolean wednesdayCheck = false;

    @Column(name = "wednesdaypricepatternid")
    private Integer wednesdayPricePatternId;

    @NotNull
    @Column(name = "thursdaycheck", nullable = false)
    private Boolean thursdayCheck = false;

    @Column(name = "thursdaypricepatternid")
    private Integer thursdayPricePatternId;

    @NotNull
    @Column(name = "fridaycheck", nullable = false)
    private Boolean fridayCheck = false;

    @Column(name = "fridaypricepatternid")
    private Integer fridayPricePatternId;

    @NotNull
    @Column(name = "saturdaycheck", nullable = false)
    private Boolean saturdayCheck = false;

    @Column(name = "saturdaypricepatternid")
    private Integer saturdayPricePatternId;

    @NotNull
    @Column(name = "sundaycheck", nullable = false)
    private Boolean sundayCheck = false;

    @Column(name = "sundaypricepatternid")
    private Integer sundayPricePatternId;

    @NotNull
    @Column(name = "beforeholidaycheck", nullable = false)
    private Boolean beforeHolidayCheck = false;

    @Column(name = "beforeholidaypricepatternid")
    private Integer beforeHolidayPricePatternId;

    @NotNull
    @Column(name = "publicholidaycheck", nullable = false)
    private Boolean publicHolidayCheck = false;

    @Column(name = "publicholidaypricepatternid")
    private Integer publicHolidayPricePatternId;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "autoextendflag", nullable = false)
    private Boolean autoExtendFlag = false;

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
