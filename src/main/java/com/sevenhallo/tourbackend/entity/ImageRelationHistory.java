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
@Table(name = "imagerelationhistory", schema = "dbo")
public class ImageRelationHistory {
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
    @Column(name = "targetid", nullable = false)
    private Integer targetId;

    @NotNull
    @Column(name = "imageid", nullable = false)
    private Integer imageId;

    @NotNull
    @Column(name = "imagedisplayrelationtype", nullable = false)
    private Integer imageDisplayRelationType;

    @Column(name = "caption_ja", length = Integer.MAX_VALUE)
    private String captionJa;

    @Column(name = "caption_en", length = Integer.MAX_VALUE)
    private String captionEn;

    @NotNull
    @Column(name = "mainimageflag", nullable = false)
    private Boolean mainImageFlag = false;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

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
