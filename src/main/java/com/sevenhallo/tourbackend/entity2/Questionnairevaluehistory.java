package com.sevenhallo.tourbackend.entity2;

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
public class Questionnairevaluehistory {
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
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

    @NotNull
    @Column(name = "optiondefineid", nullable = false)
    private Integer optiondefineid;

    @NotNull
    @Column(name = "questionnairedefinerelationid", nullable = false)
    private Integer questionnairedefinerelationid;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationuserid;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @Column(name = "generation")
    private Integer generation;

    @NotNull
    @Column(name = "countryid", nullable = false)
    private Integer countryid;

    @NotNull
    @Column(name = "sex", nullable = false)
    private Integer sex;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @Column(name = "optionitemvalue", length = Integer.MAX_VALUE)
    private String optionitemvalue;

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