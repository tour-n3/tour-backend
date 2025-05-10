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
@Table(name = "image", schema = "dbo")
public class Image {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "imagepath", length = Integer.MAX_VALUE)
    private String imagepath;

    @Size(max = 100)
    @Column(name = "imagename", length = 100)
    private String imagename;

    @Size(max = 100)
    @Column(name = "thnmbnailname", length = 100)
    private String thnmbnailname;

    @Column(name = "contentsid")
    private Integer contentsid;

    @Size(max = 100)
    @Column(name = "keywords", length = 100)
    private String keywords;

    @NotNull
    @Column(name = "imagetype", nullable = false)
    private Integer imagetype;

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