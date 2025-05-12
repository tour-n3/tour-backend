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
@Table(name = "questionnairedefinerelationhistory", schema = "dbo")
public class QuestionnaireDefineRelationHistory {
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
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleFlag;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @NotNull
    @Column(name = "optionformid", nullable = false)
    private Integer optionFormId;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optionDefineId;

    @NotNull
    @Column(name = "optiondefineorder", nullable = false)
    private Integer optionDefineOrder;

    @Column(name = "parentoptiondefinerelationid")
    private Integer parentOptionDefineRelationId;

    @Column(name = "parentoptiondefineelmid", length = Integer.MAX_VALUE)
    private String parentOptionDefineElmId;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

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
