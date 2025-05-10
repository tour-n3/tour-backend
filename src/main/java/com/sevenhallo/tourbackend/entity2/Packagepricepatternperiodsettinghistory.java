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
@Table(name = "packagepricepatternperiodsettinghistory", schema = "dbo")
public class Packagepricepatternperiodsettinghistory {
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

    @NotNull
    @Column(name = "packageid", nullable = false)
    private Integer packageid;

    @NotNull
    @Column(name = "contentsdetailtypeid", nullable = false)
    private Integer contentsdetailtypeid;

    @NotNull
    @Column(name = "mondaycheck", nullable = false)
    private Boolean mondaycheck = false;

    @Column(name = "mondaypricepatternid")
    private Integer mondaypricepatternid;

    @NotNull
    @Column(name = "tuesdaycheck", nullable = false)
    private Boolean tuesdaycheck = false;

    @Column(name = "tuesdaypricepatternid")
    private Integer tuesdaypricepatternid;

    @NotNull
    @Column(name = "wednesdaycheck", nullable = false)
    private Boolean wednesdaycheck = false;

    @Column(name = "wednesdaypricepatternid")
    private Integer wednesdaypricepatternid;

    @NotNull
    @Column(name = "thursdaycheck", nullable = false)
    private Boolean thursdaycheck = false;

    @Column(name = "thursdaypricepatternid")
    private Integer thursdaypricepatternid;

    @NotNull
    @Column(name = "fridaycheck", nullable = false)
    private Boolean fridaycheck = false;

    @Column(name = "fridaypricepatternid")
    private Integer fridaypricepatternid;

    @NotNull
    @Column(name = "saturdaycheck", nullable = false)
    private Boolean saturdaycheck = false;

    @Column(name = "saturdaypricepatternid")
    private Integer saturdaypricepatternid;

    @NotNull
    @Column(name = "sundaycheck", nullable = false)
    private Boolean sundaycheck = false;

    @Column(name = "sundaypricepatternid")
    private Integer sundaypricepatternid;

    @NotNull
    @Column(name = "beforeholidaycheck", nullable = false)
    private Boolean beforeholidaycheck = false;

    @Column(name = "beforeholidaypricepatternid")
    private Integer beforeholidaypricepatternid;

    @NotNull
    @Column(name = "publicholidaycheck", nullable = false)
    private Boolean publicholidaycheck = false;

    @Column(name = "publicholidaypricepatternid")
    private Integer publicholidaypricepatternid;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "autoextendflag", nullable = false)
    private Boolean autoextendflag = false;

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

}