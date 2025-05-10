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
@Table(name = "optiondefine", schema = "dbo")
public class Optiondefine {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "optionformclass", nullable = false)
    private Integer optionformclass;

    @NotNull
    @Column(name = "optiontype", nullable = false)
    private Integer optiontype;

    @NotNull
    @Column(name = "repeatdirection", nullable = false)
    private Integer repeatdirection;

    @NotNull
    @Column(name = "requiredtype", nullable = false)
    private Integer requiredtype;

    @NotNull
    @Column(name = "inputchecktype", nullable = false)
    private Integer inputchecktype;

    @NotNull
    @Column(name = "minlength", nullable = false)
    private Integer minlength;

    @NotNull
    @Column(name = "maxlength", nullable = false)
    private Integer maxlength;

    @Column(name = "optiongrouptitle_ja", length = Integer.MAX_VALUE)
    private String optiongrouptitleJa;

    @Column(name = "optiongrouptitle_en", length = Integer.MAX_VALUE)
    private String optiongrouptitleEn;

    @Column(name = "optiontitle_ja", length = Integer.MAX_VALUE)
    private String optiontitleJa;

    @Column(name = "optiontitle_en", length = Integer.MAX_VALUE)
    private String optiontitleEn;

    @Column(name = "labelbefore_ja", length = Integer.MAX_VALUE)
    private String labelbeforeJa;

    @Column(name = "labelbefore_en", length = Integer.MAX_VALUE)
    private String labelbeforeEn;

    @Column(name = "labelafter_ja", length = Integer.MAX_VALUE)
    private String labelafterJa;

    @Column(name = "labelafter_en", length = Integer.MAX_VALUE)
    private String labelafterEn;

    @Column(name = "commentbefore_ja", length = Integer.MAX_VALUE)
    private String commentbeforeJa;

    @Column(name = "commentbefore_en", length = Integer.MAX_VALUE)
    private String commentbeforeEn;

    @Column(name = "commentafter_ja", length = Integer.MAX_VALUE)
    private String commentafterJa;

    @Column(name = "commentafter_en", length = Integer.MAX_VALUE)
    private String commentafterEn;

    @Column(name = "linkurl_ja", length = Integer.MAX_VALUE)
    private String linkurlJa;

    @Column(name = "linkurl_en", length = Integer.MAX_VALUE)
    private String linkurlEn;

    @NotNull
    @Column(name = "selectdisplaytype", nullable = false)
    private Integer selectdisplaytype;

    @NotNull
    @Column(name = "numberselectmin", nullable = false)
    private Integer numberselectmin;

    @NotNull
    @Column(name = "numberselectmax", nullable = false)
    private Integer numberselectmax;

    @NotNull
    @Column(name = "numberselectstep", nullable = false)
    private Integer numberselectstep;

    @NotNull
    @Column(name = "numberselectzeropadding", nullable = false)
    private Integer numberselectzeropadding;

    @NotNull
    @Column(name = "selectflag", nullable = false)
    private Boolean selectflag = false;

    @NotNull
    @Column(name = "size", nullable = false)
    private Integer size;

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