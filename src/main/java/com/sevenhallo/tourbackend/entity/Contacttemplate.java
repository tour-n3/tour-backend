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
@Table(name = "contacttemplates", schema = "dbo")
public class Contacttemplate {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "title", length = 100)
    private String title;

    @Size(max = 500)
    @Column(name = "message", length = 500)
    private String message;

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