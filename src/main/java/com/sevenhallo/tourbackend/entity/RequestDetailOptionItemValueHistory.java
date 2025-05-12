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
@Table(name = "requestdetailoptionitemvaluehistory", schema = "dbo")
public class RequestDetailOptionItemValueHistory {
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
    @Column(name = "requestdetailid", nullable = false)
    private Integer requestDetailId;

    @NotNull
    @Column(name = "optionformid", nullable = false)
    private Integer optionFormId;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optionDefineId;

    @NotNull
    @Column(name = "optiondefinerelationid", nullable = false)
    private Integer optionDefineRelationId;

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
