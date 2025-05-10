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
@Table(name = "sendmaillog", schema = "dbo")
public class Sendmaillog {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 128)
    @Column(name = "applicationuserid", length = 128)
    private String applicationuserid;

    @NotNull
    @Column(name = "mailtype", nullable = false)
    private Integer mailtype;

    @Size(max = 250)
    @Column(name = "mailfrom", length = 250)
    private String mailfrom;

    @Column(name = "mailto", length = Integer.MAX_VALUE)
    private String mailto;

    @Column(name = "mailcc", length = Integer.MAX_VALUE)
    private String mailcc;

    @Column(name = "mailbcc", length = Integer.MAX_VALUE)
    private String mailbcc;

    @Column(name = "mailreplyto", length = Integer.MAX_VALUE)
    private String mailreplyto;

    @Size(max = 500)
    @Column(name = "mailsubject", length = 500)
    private String mailsubject;

    @Column(name = "mailbody", length = Integer.MAX_VALUE)
    private String mailbody;

    @Size(max = 500)
    @Column(name = "sendresult", length = 500)
    private String sendresult;

    @NotNull
    @Column(name = "senddate", nullable = false)
    private Instant senddate;

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