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
public class GmoTranLog {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestId;

    @NotNull
    @Column(name = "gmotranlogtype", nullable = false)
    private Integer gmoTranLogType;

    @NotNull
    @Column(name = "responseflag", nullable = false)
    private Boolean responseFlag = false;

    @Size(max = 3)
    @Column(name = "version", length = 3)
    private String version;

    @Size(max = 13)
    @Column(name = "shopid", length = 13)
    private String shopId;

    @Size(max = 10)
    @Column(name = "shoppass", length = 10)
    private String shopPass;

    @Size(max = 27)
    @Column(name = "orderid", length = 27)
    private String orderId;

    @Size(max = 10)
    @Column(name = "jobcd", length = 10)
    private String jobCd;

    @Size(max = 7)
    @Column(name = "itemcode", length = 7)
    private String itemCode;

    @Size(max = 7)
    @Column(name = "amount", length = 7)
    private String amount;

    @Size(max = 7)
    @Column(name = "tax", length = 7)
    private String tax;

    @Size(max = 1)
    @Column(name = "tdflag", length = 1)
    private String tdFlag;

    @Size(max = 25)
    @Column(name = "tdtenantname", length = 25)
    private String tdTenantName;

    @Size(max = 32)
    @Column(name = "accessid", length = 32)
    private String accessId;

    @Size(max = 32)
    @Column(name = "accesspass", length = 32)
    private String accessPass;

    @Column(name = "errcode", length = Integer.MAX_VALUE)
    private String errCode;

    @Column(name = "errinfo", length = Integer.MAX_VALUE)
    private String errInfo;

    @Size(max = 1)
    @Column(name = "method", length = 1)
    private String method;

    @Size(max = 2)
    @Column(name = "paytimes", length = 2)
    private String payTimes;

    @Size(max = 16)
    @Column(name = "cardno", length = 16)
    private String cardNo;

    @Size(max = 4)
    @Column(name = "expire", length = 4)
    private String expire;

    @Size(max = 4)
    @Column(name = "securitycode", length = 4)
    private String securityCode;

    @Column(name = "token", length = Integer.MAX_VALUE)
    private String token;

    @Size(max = 4)
    @Column(name = "pin", length = 4)
    private String pin;

    @Size(max = 100)
    @Column(name = "clientfield1", length = 100)
    private String clientField1;

    @Size(max = 100)
    @Column(name = "clientfield2", length = 100)
    private String clientField2;

    @Size(max = 100)
    @Column(name = "clientfield3", length = 100)
    private String clientField3;

    @Size(max = 1)
    @Column(name = "clientfieldflag", length = 1)
    private String clientFieldFlag;

    @Size(max = 1)
    @Column(name = "tokentype", length = 1)
    private String tokenType;

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
    private String tranId;

    @Size(max = 14)
    @Column(name = "trandate", length = 14)
    private String tranDate;

    @Size(max = 32)
    @Column(name = "checkstring", length = 32)
    private String checkString;

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
