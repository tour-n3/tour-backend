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
@Table(name = "sendmaillog", schema = "dbo")
public class SendMailLog {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 128)
    @Column(name = "applicationuserid", length = 128)
    private String applicationUserId;

    @NotNull
    @Column(name = "mailtype", nullable = false)
    private Integer mailType;

    @Size(max = 250)
    @Column(name = "mailfrom", length = 250)
    private String mailFrom;

    @Column(name = "mailto", length = Integer.MAX_VALUE)
    private String mailTo;

    @Column(name = "mailcc", length = Integer.MAX_VALUE)
    private String mailCc;

    @Column(name = "mailbcc", length = Integer.MAX_VALUE)
    private String mailBcc;

    @Column(name = "mailreplyto", length = Integer.MAX_VALUE)
    private String mailReplyTo;

    @Size(max = 500)
    @Column(name = "mailsubject", length = 500)
    private String mailSubject;

    @Column(name = "mailbody", length = Integer.MAX_VALUE)
    private String mailBody;

    @Size(max = 500)
    @Column(name = "sendresult", length = 500)
    private String sendResult;

    @NotNull
    @Column(name = "senddate", nullable = false)
    private Instant sendDate;

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
