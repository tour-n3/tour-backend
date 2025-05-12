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
@Table(name = "questionnairevaluehistory", schema = "dbo")
public class QuestionnaireValueHistory {
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
    @Column(name = "requestid", nullable = false)
    private Integer requestId;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optionDefineId;

    @NotNull
    @Column(name = "questionnairedefinerelationid", nullable = false)
    private Integer questionnaireDefineRelationId;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationUserId;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberId;

    @Column(name = "generation")
    private Integer generation;

    @NotNull
    @Column(name = "countryid", nullable = false)
    private Integer countryId;

    @NotNull
    @Column(name = "sex", nullable = false)
    private Integer sex;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @Column(name = "optionitemvalue", length = Integer.MAX_VALUE)
    private String optionItemValue;

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
