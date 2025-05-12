package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationrole", schema = "dbo")
public class ApplicationRole {
    @Id
    @Size(max = 128)
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @NotNull
    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "admintypename", length = Integer.MAX_VALUE)
    private String adminTypeName;

    @Column(name = "adminorder")
    private Integer adminOrder;

    @Size(max = 128)
    @NotNull
    @Column(name = "discriminator", nullable = false, length = 128)
    private String discriminator;

    @Column(name = "concurrencystamp", length = Integer.MAX_VALUE)
    private String concurrencyStamp;

    @Column(name = "normalizedname", length = Integer.MAX_VALUE)
    private String normalizedName;

}
