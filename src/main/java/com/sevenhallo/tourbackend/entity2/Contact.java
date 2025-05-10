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
@Table(name = "contacts", schema = "dbo")
public class Contact {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "fromusertype", nullable = false)
    private Integer fromusertype;

    @NotNull
    @Column(name = "tousertype", nullable = false)
    private Integer tousertype;

    @NotNull
    @Column(name = "fromuserid", nullable = false)
    private Integer fromuserid;

    @NotNull
    @Column(name = "touserid", nullable = false)
    private Integer touserid;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

    @Column(name = "requestdetailid")
    private Integer requestdetailid;

    @Column(name = "message", length = Integer.MAX_VALUE)
    private String message;

    @NotNull
    @Column(name = "alreadyread", nullable = false)
    private Boolean alreadyread = false;

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