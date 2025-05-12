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
@Table(name = "optionform", schema = "dbo")
public class OptionForm {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "optionformclass", nullable = false)
    private Integer optionFormClass;

    @Column(name = "layout_ja", length = Integer.MAX_VALUE)
    private String layoutJa;

    @Column(name = "layout_en", length = Integer.MAX_VALUE)
    private String layoutEn;

    @Column(name = "confirmlayout_ja", length = Integer.MAX_VALUE)
    private String confirmLayoutJa;

    @Column(name = "confirmlayout_en", length = Integer.MAX_VALUE)
    private String confirmLayoutEn;

    @Column(name = "maillayout_ja", length = Integer.MAX_VALUE)
    private String mailLayoutJa;

    @Column(name = "maillayout_en", length = Integer.MAX_VALUE)
    private String mailLayoutEn;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

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
