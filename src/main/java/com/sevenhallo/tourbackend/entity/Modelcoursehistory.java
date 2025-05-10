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
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "modelcoursehistory", schema = "dbo")
public class Modelcoursehistory {
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

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @NotNull
    @Column(name = "distance", nullable = false)
    private Integer distance;

    @NotNull
    @Column(name = "language_ja", nullable = false)
    private Boolean languageJa = false;

    @NotNull
    @Column(name = "language_en", nullable = false)
    private Boolean languageEn = false;

    @NotNull
    @Column(name = "recommended", nullable = false)
    private Boolean recommended = false;

    @NotNull
    @Column(name = "difficulty", nullable = false)
    private Integer difficulty;

    @NotNull
    @Column(name = "displaykumanokodopageflag", nullable = false)
    private Integer displaykumanokodopageflag;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

    @NotNull
    @Column(name = "offerpublic", nullable = false)
    private Boolean offerpublic = false;

    @NotNull
    @Column(name = "offeragent", nullable = false)
    private Boolean offeragent = false;

    @NotNull
    @Column(name = "offerevent", nullable = false)
    private Boolean offerevent = false;

    @NotNull
    @Column(name = "postspanstart", nullable = false)
    private LocalDate postspanstart;

    @Column(name = "postspanend")
    private LocalDate postspanend;

    @NotNull
    @Column(name = "availablespanstart", nullable = false)
    private Instant availablespanstart;

    @Column(name = "availablespanend")
    private Instant availablespanend;

    @Column(name = "bookablespandayagostart")
    private Integer bookablespandayagostart;

    @Column(name = "bookablespandayagostarttime")
    private Integer bookablespandayagostarttime;

    @Column(name = "bookablespandayagoend")
    private Integer bookablespandayagoend;

    @Column(name = "bookablespandayagoendtime")
    private Integer bookablespandayagoendtime;

    @NotNull
    @Column(name = "bookablealldayflag", nullable = false)
    private Boolean bookablealldayflag = false;

    @Column(name = "detail_ja", length = Integer.MAX_VALUE)
    private String detailJa;

    @Column(name = "detail_en", length = Integer.MAX_VALUE)
    private String detailEn;

    @Size(max = 100)
    @Column(name = "urlcode", length = 100)
    private String urlcode;

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
    @Column(name = "hideselectdateflag", nullable = false)
    private Boolean hideselectdateflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "selectallagentflag", nullable = false)
    private Boolean selectallagentflag = false;

}