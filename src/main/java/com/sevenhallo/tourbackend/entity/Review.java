package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "review", schema = "dbo")
public class Review {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestId;

    @NotNull
    @Column(name = "requestdetailid", nullable = false)
    private Integer requestDetailId;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationUserId;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberId;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planId;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String planNameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String planNameEn;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsId;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsNameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsNameEn;

    @Column(name = "modelcourseid")
    private Integer modelCourseId;

    @Column(name = "modelcoursename_ja", length = Integer.MAX_VALUE)
    private String modelCourseNameJa;

    @Column(name = "modelcoursename_en", length = Integer.MAX_VALUE)
    private String modelCourseNameEn;

    @NotNull
    @Column(name = "usestartdate", nullable = false)
    private Instant useStartDate;

    @NotNull
    @Column(name = "satisfactionstars", nullable = false, precision = 18, scale = 2)
    private BigDecimal satisfactionStars;

    @NotNull
    @Column(name = "roomstars", nullable = false)
    private Integer roomStars;

    @NotNull
    @Column(name = "mealstars", nullable = false)
    private Integer mealStars;

    @NotNull
    @Column(name = "bathstars", nullable = false)
    private Integer bathStars;

    @NotNull
    @Column(name = "servicestars", nullable = false)
    private Integer serviceStars;

    @NotNull
    @Column(name = "locationstars", nullable = false)
    private Integer locationStars;

    @NotNull
    @Column(name = "reviewclass", nullable = false)
    private Integer reviewClass;

    @Column(name = "generation")
    private Integer generation;

    @NotNull
    @Column(name = "countryid", nullable = false)
    private Integer countryId;

    @NotNull
    @Column(name = "sex", nullable = false)
    private Integer sex;

    @Column(name = "comment", length = Integer.MAX_VALUE)
    private String comment;

    @Size(max = 200)
    @Column(name = "subject", length = 200)
    private String subject;

    @Column(name = "replycomment", length = Integer.MAX_VALUE)
    private String replyComment;

    @NotNull
    @Column(name = "replyvisibleflag", nullable = false)
    private Integer replyVisibleFlag;

    @Column(name = "replydate")
    private Instant replyDate;

    @NotNull
    @Column(name = "reviewstatus", nullable = false)
    private Integer reviewStatus;

    @Column(name = "publicdate")
    private Instant publicDate;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

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

    @Column(name = "packageid")
    private Integer packageId;

    @Column(name = "packagename_ja", length = Integer.MAX_VALUE)
    private String packageNameJa;

    @Column(name = "packagename_en", length = Integer.MAX_VALUE)
    private String packageNameEn;

}
