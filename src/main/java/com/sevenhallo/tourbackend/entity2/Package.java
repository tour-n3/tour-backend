package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "package", schema = "dbo")
public class Package {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "packagetype", nullable = false)
    private Integer packagetype;

    @Size(max = 128)
    @Column(name = "name_ja", length = 128)
    private String nameJa;

    @Size(max = 128)
    @Column(name = "name_en", length = 128)
    private String nameEn;

    @NotNull
    @Column(name = "distance", nullable = false)
    private Integer distance;

    @NotNull
    @Column(name = "display_ja", nullable = false)
    private Boolean displayJa = false;

    @NotNull
    @Column(name = "display_en", nullable = false)
    private Boolean displayEn = false;

    @NotNull
    @Column(name = "topdisp", nullable = false)
    private Integer topdisp;

    @NotNull
    @Column(name = "displaykumanokodopageflag", nullable = false)
    private Integer displaykumanokodopageflag;

    @NotNull
    @Column(name = "kumanokodoulevel", nullable = false)
    private Integer kumanokodoulevel;

    @NotNull
    @Column(name = "commonpilgrimageflag", nullable = false)
    private Integer commonpilgrimageflag;

    @NotNull
    @Column(name = "vegetarianismflag", nullable = false)
    private Integer vegetarianismflag;

    @NotNull
    @Column(name = "vegetarianismmeetflag", nullable = false)
    private Boolean vegetarianismmeetflag = false;

    @NotNull
    @Column(name = "vegetarianismfishflag", nullable = false)
    private Boolean vegetarianismfishflag = false;

    @NotNull
    @Column(name = "vegetarianismseafoodflag", nullable = false)
    private Boolean vegetarianismseafoodflag = false;

    @NotNull
    @Column(name = "vegetarianismbonitostockflag", nullable = false)
    private Boolean vegetarianismbonitostockflag = false;

    @NotNull
    @Column(name = "vegetarianismdairyproductsflag", nullable = false)
    private Boolean vegetarianismdairyproductsflag = false;

    @NotNull
    @Column(name = "vegetarianismeggflag", nullable = false)
    private Boolean vegetarianismeggflag = false;

    @NotNull
    @Column(name = "glutenfreeflag", nullable = false)
    private Integer glutenfreeflag;

    @NotNull
    @Column(name = "glutenfreesoyproductsflag", nullable = false)
    private Integer glutenfreesoyproductsflag;

    @NotNull
    @Column(name = "allergyflag", nullable = false)
    private Integer allergyflag;

    @NotNull
    @Column(name = "dietaryrestflag", nullable = false)
    private Integer dietaryrestflag;

    @NotNull
    @Column(name = "dietaryrestaflag", nullable = false)
    private Boolean dietaryrestaflag = false;

    @NotNull
    @Column(name = "dietaryrestbflag", nullable = false)
    private Boolean dietaryrestbflag = false;

    @NotNull
    @Column(name = "dietaryrestcflag", nullable = false)
    private Boolean dietaryrestcflag = false;

    @NotNull
    @Column(name = "dietaryrestdflag", nullable = false)
    private Boolean dietaryrestdflag = false;

    @NotNull
    @Column(name = "includepackage", nullable = false)
    private Boolean includepackage = false;

    @NotNull
    @Column(name = "offerpublic", nullable = false)
    private Boolean offerpublic = false;

    @NotNull
    @Column(name = "offeragent", nullable = false)
    private Boolean offeragent = false;

    @NotNull
    @Column(name = "offerevent", nullable = false)
    private Boolean offerevent = false;

    @NotNull
    @Column(name = "selectallagentflag", nullable = false)
    private Boolean selectallagentflag = false;

    @NotNull
    @Column(name = "hideselectdateflag", nullable = false)
    private Integer hideselectdateflag;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleflag;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

    @NotNull
    @Column(name = "postspanstart", nullable = false)
    private LocalDate postspanstart;

    @Column(name = "postspanend")
    private LocalDate postspanend;

    @NotNull
    @Column(name = "availablespanstart", nullable = false)
    private LocalDate availablespanstart;

    @Column(name = "availablespanend")
    private LocalDate availablespanend;

    @Column(name = "detail_ja", length = Integer.MAX_VALUE)
    private String detailJa;

    @Column(name = "detail_en", length = Integer.MAX_VALUE)
    private String detailEn;

    @Size(max = 256)
    @Column(name = "urldoc", length = 256)
    private String urldoc;

    @Column(name = "pricetype")
    private Integer pricetype;

    @Column(name = "perpiecemin")
    private Integer perpiecemin;

    @Column(name = "perpiecemax")
    private Integer perpiecemax;

    @Column(name = "searchprice")
    private Integer searchprice;

    @Column(name = "searchpricemax")
    private Integer searchpricemax;

    @Column(name = "priceunittitle_ja", length = Integer.MAX_VALUE)
    private String priceunittitleJa;

    @Column(name = "priceunittitle_en", length = Integer.MAX_VALUE)
    private String priceunittitleEn;

    @Column(name = "priceunitname_ja", length = Integer.MAX_VALUE)
    private String priceunitnameJa;

    @Column(name = "priceunitname_en", length = Integer.MAX_VALUE)
    private String priceunitnameEn;

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

    @NotNull
    @ColumnDefault("false")
    @Column(name = "display_top_ja", nullable = false)
    private Boolean displayTopJa = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "display_top_en", nullable = false)
    private Boolean displayTopEn = false;

}