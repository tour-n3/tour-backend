package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "__migrationhistory", schema = "dbo")
public class Migrationhistory {
    @EmbeddedId
    private MigrationhistoryId id;

    @NotNull
    @Column(name = "model", nullable = false)
    private byte[] model;

    @Size(max = 32)
    @NotNull
    @Column(name = "productversion", nullable = false, length = 32)
    private String productversion;

}