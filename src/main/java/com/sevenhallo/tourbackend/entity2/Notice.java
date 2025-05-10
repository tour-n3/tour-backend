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
@Table(name = "notice", schema = "dbo")
public class Notice {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "noticetype", nullable = false)
    private Integer noticetype;

    @NotNull
    @Column(name = "usersite", nullable = false)
    private Boolean usersite = false;

    @NotNull
    @Column(name = "usersiteen", nullable = false)
    private Boolean usersiteen = false;

    @NotNull
    @Column(name = "\"user\"", nullable = false)
    private Boolean user = false;

    @NotNull
    @Column(name = "supplier", nullable = false)
    private Boolean supplier = false;

    @NotNull
    @Column(name = "supplieren", nullable = false)
    private Boolean supplieren = false;

    @NotNull
    @Column(name = "agent", nullable = false)
    private Boolean agent = false;

    @NotNull
    @Column(name = "agenten", nullable = false)
    private Boolean agenten = false;

    @NotNull
    @Column(name = "admin", nullable = false)
    private Boolean admin = false;

    @Column(name = "noticecontents_ja", length = Integer.MAX_VALUE)
    private String noticecontentsJa;

    @Column(name = "noticecontents_en", length = Integer.MAX_VALUE)
    private String noticecontentsEn;

    @Column(name = "releasestart")
    private Instant releasestart;

    @Column(name = "releaseend")
    private Instant releaseend;

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

    @Column(name = "title_ja", length = Integer.MAX_VALUE)
    private String titleJa;

    @Column(name = "title_en", length = Integer.MAX_VALUE)
    private String titleEn;

}