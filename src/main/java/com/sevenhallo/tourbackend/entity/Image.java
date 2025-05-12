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
@Table(name = "image", schema = "dbo")
public class Image {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "imagepath", length = Integer.MAX_VALUE)
    private String imagePath;

    @Size(max = 100)
    @Column(name = "imagename", length = 100)
    private String imageName;

    @Size(max = 100)
    @Column(name = "thnmbnailname", length = 100)
    private String thumbnailName;

    @Column(name = "contentsid")
    private Integer contentsId;

    @Size(max = 100)
    @Column(name = "keywords", length = 100)
    private String keywords;

    @NotNull
    @Column(name = "imagetype", nullable = false)
    private Integer imageType;

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
