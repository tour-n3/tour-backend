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
@Table(name = "gmotranlog", schema = "dbo")
public class Gmotranlog {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

    @NotNull
    @Column(name = "gmotranlogtype", nullable = false)
    private Integer gmotranlogtype;

    @NotNull
    @Column(name = "responseflag", nullable = false)
    private Boolean responseflag = false;

    @Size(max = 3)
    @Column(name = "version", length = 3)
    private String version;

    @Size(max = 13)
    @Column(name = "shopid", length = 13)
    private String shopid;

    @Size(max = 10)
    @Column(name = "shoppass", length = 10)
    private String shoppass;

    @Size(max = 27)
    @Column(name = "orderid", length = 27)
    private String orderid;

    @Size(max = 10)
    @Column(name = "jobcd", length = 10)
    private String jobcd;

    @Size(max = 7)
    @Column(name = "itemcode", length = 7)
    private String itemcode;

    @Size(max = 7)
    @Column(name = "amount", length = 7)
    private String amount;

    @Size(max = 7)
    @Column(name = "tax", length = 7)
    private String tax;

    @Size(max = 1)
    @Column(name = "tdflag", length = 1)
    private String tdflag;

    @Size(max = 25)
    @Column(name = "tdtenantname", length = 25)
    private String tdtenantname;

    @Size(max = 32)
    @Column(name = "accessid", length = 32)
    private String accessid;

    @Size(max = 32)
    @Column(name = "accesspass", length = 32)
    private String accesspass;

    @Column(name = "errcode", length = Integer.MAX_VALUE)
    private String errcode;

    @Column(name = "errinfo", length = Integer.MAX_VALUE)
    private String errinfo;

    @Size(max = 1)
    @Column(name = "method", length = 1)
    private String method;

    @Size(max = 2)
    @Column(name = "paytimes", length = 2)
    private String paytimes;

    @Size(max = 16)
    @Column(name = "cardno", length = 16)
    private String cardno;

    @Size(max = 4)
    @Column(name = "expire", length = 4)
    private String expire;

    @Size(max = 4)
    @Column(name = "securitycode", length = 4)
    private String securitycode;

    @Column(name = "token", length = Integer.MAX_VALUE)
    private String token;

    @Size(max = 4)
    @Column(name = "pin", length = 4)
    private String pin;

    @Size(max = 100)
    @Column(name = "clientfield1", length = 100)
    private String clientfield1;

    @Size(max = 100)
    @Column(name = "clientfield2", length = 100)
    private String clientfield2;

    @Size(max = 100)
    @Column(name = "clientfield3", length = 100)
    private String clientfield3;

    @Size(max = 1)
    @Column(name = "clientfieldflag", length = 1)
    private String clientfieldflag;

    @Size(max = 1)
    @Column(name = "tokentype", length = 1)
    private String tokentype;

    @Size(max = 1)
    @Column(name = "acs", length = 1)
    private String acs;

    @Size(max = 7)
    @Column(name = "forward", length = 7)
    private String forward;

    @Size(max = 7)
    @Column(name = "approve", length = 7)
    private String approve;

    @Size(max = 28)
    @Column(name = "tranid", length = 28)
    private String tranid;

    @Size(max = 14)
    @Column(name = "trandate", length = 14)
    private String trandate;

    @Size(max = 32)
    @Column(name = "checkstring", length = 32)
    private String checkstring;

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