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
@Table(name = "questionnairevalueelmhistory", schema = "dbo")
public class Questionnairevalueelmhistory {
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
    @Column(name = "questionnairevalueid", nullable = false)
    private Integer questionnairevalueid;

    @NotNull
    @Column(name = "optiondefineelmid", nullable = false)
    private Integer optiondefineelmid;

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