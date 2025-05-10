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
@Table(name = "optionformhistory", schema = "dbo")
public class Optionformhistory {
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
    @Column(name = "optionformclass", nullable = false)
    private Integer optionformclass;

    @Column(name = "layout_ja", length = Integer.MAX_VALUE)
    private String layoutJa;

    @Column(name = "layout_en", length = Integer.MAX_VALUE)
    private String layoutEn;

    @Column(name = "confirmlayout_ja", length = Integer.MAX_VALUE)
    private String confirmlayoutJa;

    @Column(name = "confirmlayout_en", length = Integer.MAX_VALUE)
    private String confirmlayoutEn;

    @Column(name = "maillayout_ja", length = Integer.MAX_VALUE)
    private String maillayoutJa;

    @Column(name = "maillayout_en", length = Integer.MAX_VALUE)
    private String maillayoutEn;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

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