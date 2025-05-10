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
@Table(name = "applicationuser", schema = "dbo")
public class Applicationuser {
    @Id
    @Size(max = 128)
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @Column(name = "email", length = Integer.MAX_VALUE)
    private String email;

    @NotNull
    @Column(name = "emailconfirmed", nullable = false)
    private Boolean emailconfirmed = false;

    @Column(name = "passwordhash", length = Integer.MAX_VALUE)
    private String passwordhash;

    @Column(name = "securitystamp", length = Integer.MAX_VALUE)
    private String securitystamp;

    @Column(name = "phonenumber", length = Integer.MAX_VALUE)
    private String phonenumber;

    @NotNull
    @Column(name = "phonenumberconfirmed", nullable = false)
    private Boolean phonenumberconfirmed = false;

    @NotNull
    @Column(name = "twofactorenabled", nullable = false)
    private Boolean twofactorenabled = false;

    @Column(name = "lockoutenddateutc")
    private Instant lockoutenddateutc;

    @NotNull
    @Column(name = "lockoutenabled", nullable = false)
    private Boolean lockoutenabled = false;

    @NotNull
    @Column(name = "accessfailedcount", nullable = false)
    private Integer accessfailedcount;

    @NotNull
    @Column(name = "username", nullable = false, length = Integer.MAX_VALUE)
    private String username;

    @Column(name = "resetpasswordtimeout")
    private Instant resetpasswordtimeout;

    @Column(name = "passwordavailableenddate")
    private Instant passwordavailableenddate;

    @Column(name = "applicationrolename", length = Integer.MAX_VALUE)
    private String applicationrolename;

    @Column(name = "updateapplicationuserid", length = Integer.MAX_VALUE)
    private String updateapplicationuserid;

    @Size(max = 128)
    @NotNull
    @Column(name = "discriminator", nullable = false, length = 128)
    private String discriminator;

    @Column(name = "concurrencystamp", length = Integer.MAX_VALUE)
    private String concurrencystamp;

    @Column(name = "normalizedusername", length = Integer.MAX_VALUE)
    private String normalizedusername;

    @Column(name = "normalizedemail", length = Integer.MAX_VALUE)
    private String normalizedemail;

}