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
@Table(name = "optiondefinehistory", schema = "dbo")
public class OptionDefineHistory {
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
    @Column(name = "optionformclass", nullable = false)
    private Integer optionFormClass;

    @NotNull
    @Column(name = "optiontype", nullable = false)
    private Integer optionType;

    @NotNull
    @Column(name = "repeatdirection", nullable = false)
    private Integer repeatDirection;

    @NotNull
    @Column(name = "requiredtype", nullable = false)
    private Integer requiredType;

    @NotNull
    @Column(name = "inputchecktype", nullable = false)
    private Integer inputCheckType;

    @NotNull
    @Column(name = "minlength", nullable = false)
    private Integer minLength;

    @NotNull
    @Column(name = "maxlength", nullable = false)
    private Integer maxLength;

    @Column(name = "optiongrouptitle_ja", length = Integer.MAX_VALUE)
    private String optionGroupTitleJa;

    @Column(name = "optiongrouptitle_en", length = Integer.MAX_VALUE)
    private String optionGroupTitleEn;

    @Column(name = "optiontitle_ja", length = Integer.MAX_VALUE)
    private String optionTitleJa;

    @Column(name = "optiontitle_en", length = Integer.MAX_VALUE)
    private String optionTitleEn;

    @Column(name = "labelbefore_ja", length = Integer.MAX_VALUE)
    private String labelBeforeJa;

    @Column(name = "labelbefore_en", length = Integer.MAX_VALUE)
    private String labelBeforeEn;

    @Column(name = "labelafter_ja", length = Integer.MAX_VALUE)
    private String labelAfterJa;

    @Column(name = "labelafter_en", length = Integer.MAX_VALUE)
    private String labelAfterEn;

    @Column(name = "commentbefore_ja", length = Integer.MAX_VALUE)
    private String commentBeforeJa;

    @Column(name = "commentbefore_en", length = Integer.MAX_VALUE)
    private String commentBeforeEn;

    @Column(name = "commentafter_ja", length = Integer.MAX_VALUE)
    private String commentAfterJa;

    @Column(name = "commentafter_en", length = Integer.MAX_VALUE)
    private String commentAfterEn;

    @Column(name = "linkurl_ja", length = Integer.MAX_VALUE)
    private String linkUrlJa;

    @Column(name = "linkurl_en", length = Integer.MAX_VALUE)
    private String linkUrlEn;

    @NotNull
    @Column(name = "selectdisplaytype", nullable = false)
    private Integer selectDisplayType;

    @NotNull
    @Column(name = "numberselectmin", nullable = false)
    private Integer numberSelectMin;

    @NotNull
    @Column(name = "numberselectmax", nullable = false)
    private Integer numberSelectMax;

    @NotNull
    @Column(name = "numberselectstep", nullable = false)
    private Integer numberSelectStep;

    @NotNull
    @Column(name = "numberselectzeropadding", nullable = false)
    private Integer numberSelectZeroPadding;

    @NotNull
    @Column(name = "selectflag", nullable = false)
    private Boolean selectFlag = false;

    @NotNull
    @Column(name = "size", nullable = false)
    private Integer size;

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