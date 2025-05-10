package com.sevenhallo.tourbackend.entity2;

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
    private Integer requestid;

    @NotNull
    @Column(name = "requestdetailid", nullable = false)
    private Integer requestdetailid;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationuserid;

    @NotNull
    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planid;

    @Column(name = "planname_ja", length = Integer.MAX_VALUE)
    private String plannameJa;

    @Column(name = "planname_en", length = Integer.MAX_VALUE)
    private String plannameEn;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsid;

    @Column(name = "contentsname_ja", length = Integer.MAX_VALUE)
    private String contentsnameJa;

    @Column(name = "contentsname_en", length = Integer.MAX_VALUE)
    private String contentsnameEn;

    @Column(name = "modelcourseid")
    private Integer modelcourseid;

    @Column(name = "modelcoursename_ja", length = Integer.MAX_VALUE)
    private String modelcoursenameJa;

    @Column(name = "modelcoursename_en", length = Integer.MAX_VALUE)
    private String modelcoursenameEn;

    @NotNull
    @Column(name = "usestartdate", nullable = false)
    private Instant usestartdate;

    @NotNull
    @Column(name = "satisfactionstars", nullable = false, precision = 18, scale = 2)
    private BigDecimal satisfactionstars;

    @NotNull
    @Column(name = "roomstars", nullable = false)
    private Integer roomstars;

    @NotNull
    @Column(name = "mealstars", nullable = false)
    private Integer mealstars;

    @NotNull
    @Column(name = "bathstars", nullable = false)
    private Integer bathstars;

    @NotNull
    @Column(name = "servicestars", nullable = false)
    private Integer servicestars;

    @NotNull
    @Column(name = "locationstars", nullable = false)
    private Integer locationstars;

    @NotNull
    @Column(name = "reviewclass", nullable = false)
    private Integer reviewclass;

    @Column(name = "generation")
    private Integer generation;

    @NotNull
    @Column(name = "countryid", nullable = false)
    private Integer countryid;

    @NotNull
    @Column(name = "sex", nullable = false)
    private Integer sex;

    @Column(name = "comment", length = Integer.MAX_VALUE)
    private String comment;

    @Size(max = 200)
    @Column(name = "subject", length = 200)
    private String subject;

    @Column(name = "replycomment", length = Integer.MAX_VALUE)
    private String replycomment;

    @NotNull
    @Column(name = "replyvisibleflag", nullable = false)
    private Integer replyvisibleflag;

    @Column(name = "replydate")
    private Instant replydate;

    @NotNull
    @Column(name = "reviewstatus", nullable = false)
    private Integer reviewstatus;

    @Column(name = "publicdate")
    private Instant publicdate;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

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

    @Column(name = "packageid")
    private Integer packageid;

    @Column(name = "packagename_ja", length = Integer.MAX_VALUE)
    private String packagenameJa;

    @Column(name = "packagename_en", length = Integer.MAX_VALUE)
    private String packagenameEn;

}