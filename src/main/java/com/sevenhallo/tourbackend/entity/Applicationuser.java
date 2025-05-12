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
public class ApplicationUser {
    @Id
    @Size(max = 128)
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @Column(name = "email", length = Integer.MAX_VALUE)
    private String email;

    @NotNull
    @Column(name = "emailconfirmed", nullable = false)
    private Boolean emailConfirmed = false;

    @Column(name = "passwordhash", length = Integer.MAX_VALUE)
    private String passwordHash;

    @Column(name = "securitystamp", length = Integer.MAX_VALUE)
    private String securityStamp;

    @Column(name = "phonenumber", length = Integer.MAX_VALUE)
    private String phoneNumber;

    @NotNull
    @Column(name = "phonenumberconfirmed", nullable = false)
    private Boolean phoneNumberConfirmed = false;

    @NotNull
    @Column(name = "twofactorenabled", nullable = false)
    private Boolean twoFactorEnabled = false;

    @Column(name = "lockoutenddateutc")
    private Instant lockoutEndDateUtc;

    @NotNull
    @Column(name = "lockoutenabled", nullable = false)
    private Boolean lockoutEnabled = false;

    @NotNull
    @Column(name = "accessfailedcount", nullable = false)
    private Integer accessFailedCount;

    @NotNull
    @Column(name = "username", nullable = false, length = Integer.MAX_VALUE)
    private String username;

    @Column(name = "resetpasswordtimeout")
    private Instant resetPasswordTimeout;

    @Column(name = "passwordavailableenddate")
    private Instant passwordAvailableEndDate;

    @Column(name = "applicationrolename", length = Integer.MAX_VALUE)
    private String applicationRoleName;

    @Column(name = "updateapplicationuserid", length = Integer.MAX_VALUE)
    private String updateApplicationUserId;

    @Size(max = 128)
    @NotNull
    @Column(name = "discriminator", nullable = false, length = 128)
    private String discriminator;

    @Column(name = "concurrencystamp", length = Integer.MAX_VALUE)
    private String concurrencyStamp;

    @Column(name = "normalizedusername", length = Integer.MAX_VALUE)
    private String normalizedUsername;

    @Column(name = "normalizedemail", length = Integer.MAX_VALUE)
    private String normalizedEmail;

}
