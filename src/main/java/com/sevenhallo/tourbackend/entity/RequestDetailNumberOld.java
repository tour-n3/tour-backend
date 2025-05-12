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
@Table(name = "requestdetailnumberolds", schema = "dbo")
public class RequestDetailNumberOld {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestId;

    @NotNull
    @Column(name = "requestdetailid", nullable = false)
    private Integer requestDetailId;

    @Column(name = "requestdate")
    private Instant requestDate;

    @NotNull
    @Column(name = "planid", nullable = false)
    private Integer planId;

    @Column(name = "ids", length = Integer.MAX_VALUE)
    private String ids;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

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
