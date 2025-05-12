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
@Table(name = "optionvaluehistroy", schema = "dbo")
public class OptionValueHistroy {
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
    @Column(name = "optionformrelationid", nullable = false)
    private Integer optionFormRelationId;

    @NotNull
    @Column(name = "optiondefinerelationid", nullable = false)
    private Integer optionDefineRelationId;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optionDefineId;

    @Column(name = "value_ja", length = Integer.MAX_VALUE)
    private String valueJa;

    @Column(name = "value_en", length = Integer.MAX_VALUE)
    private String valueEn;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleFlag;

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
