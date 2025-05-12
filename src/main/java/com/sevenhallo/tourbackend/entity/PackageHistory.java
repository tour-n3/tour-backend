package com.sevenhallo.tourbackend.entity;

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
@Table(name = "packagehistory", schema = "dbo")
public class PackageHistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "historydata_targethistoryid", nullable = false)
    private Integer historyDataTargetHistoryId;

    @NotNull
    @Column(name = "historydata_enablestartdate", nullable = false)
    private Instant historyDataEnableStartDate;

    @Column(name = "historydata_enableenddate")
    private Instant historyDataEnableEndDate;

    @NotNull
    @Column(name = "packagetype", nullable = false)
    private Integer packageType;

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
    private Integer topDisp;

    @NotNull
    @Column(name = "displaykumanokodopageflag", nullable = false)
    private Integer displayKumanoKodoPageFlag;

    @NotNull
    @Column(name = "kumanokodoulevel", nullable = false)
    private Integer kumanoKodoULevel;

    @NotNull
    @Column(name = "commonpilgrimageflag", nullable = false)
    private Integer commonPilgrimageFlag;

    @NotNull
    @Column(name = "vegetarianismflag", nullable = false)
    private Integer vegetarianismFlag;

    @NotNull
    @Column(name = "vegetarianismmeetflag", nullable = false)
    private Boolean vegetarianismMeetFlag = false;

    @NotNull
    @Column(name = "vegetarianismfishflag", nullable = false)
    private Boolean vegetarianismFishFlag = false;

    @NotNull
    @Column(name = "vegetarianismseafoodflag", nullable = false)
    private Boolean vegetarianismSeafoodFlag = false;

    @NotNull
    @Column(name = "vegetarianismbonitostockflag", nullable = false)
    private Boolean vegetarianismBonitoStockFlag = false;

    @NotNull
    @Column(name = "vegetarianismdairyproductsflag", nullable = false)
    private Boolean vegetarianismDairyProductsFlag = false;

    @NotNull
    @Column(name = "vegetarianismeggflag", nullable = false)
    private Boolean vegetarianismEggFlag = false;

    @NotNull
    @Column(name = "glutenfreeflag", nullable = false)
    private Integer glutenFreeFlag;

    @NotNull
    @Column(name = "glutenfreesoyproductsflag", nullable = false)
    private Integer glutenFreeSoyProductsFlag;

    @NotNull
    @Column(name = "allergyflag", nullable = false)
    private Integer allergyFlag;

    @NotNull
    @Column(name = "dietaryrestflag", nullable = false)
    private Integer dietaryRestFlag;

    @NotNull
    @Column(name = "dietaryrestaflag", nullable = false)
    private Boolean dietaryRestAFlag = false;

    @NotNull
    @Column(name = "dietaryrestbflag", nullable = false)
    private Boolean dietaryRestBFlag = false;

    @NotNull
    @Column(name = "dietaryrestcflag", nullable = false)
    private Boolean dietaryRestCFlag = false;

    @NotNull
    @Column(name = "dietaryrestdflag", nullable = false)
    private Boolean dietaryRestDFlag = false;

    @NotNull
    @Column(name = "includepackage", nullable = false)
    private Boolean includePackage = false;

    @NotNull
    @Column(name = "offerpublic", nullable = false)
    private Boolean offerPublic = false;

    @NotNull
    @Column(name = "offeragent", nullable = false)
    private Boolean offerAgent = false;

    @NotNull
    @Column(name = "offerevent", nullable = false)
    private Boolean offerEvent = false;

    @NotNull
    @Column(name = "selectallagentflag", nullable = false)
    private Boolean selectAllAgentFlag = false;

    @NotNull
    @Column(name = "hideselectdateflag", nullable = false)
    private Integer hideSelectDateFlag;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleFlag;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderNo;

    @NotNull
    @Column(name = "postspanstart", nullable = false)
    private LocalDate postSpanStart;

    @Column(name = "postspanend")
    private LocalDate postSpanEnd;

    @NotNull
    @Column(name = "availablespanstart", nullable = false)
    private LocalDate availableSpanStart;

    @Column(name = "availablespanend")
    private LocalDate availableSpanEnd;

    @Column(name = "detail_ja", length = Integer.MAX_VALUE)
    private String detailJa;

    @Column(name = "detail_en", length = Integer.MAX_VALUE)
    private String detailEn;

    @Size(max = 256)
    @Column(name = "urldoc", length = 256)
    private String urlDoc;

    @Column(name = "pricetype")
    private Integer priceType;

    @Column(name = "perpiecemin")
    private Integer perPieceMin;

    @Column(name = "perpiecemax")
    private Integer perPieceMax;

    @Column(name = "searchprice")
    private Integer searchPrice;

    @Column(name = "searchpricemax")
    private Integer searchPriceMax;

    @Column(name = "priceunittitle_ja", length = Integer.MAX_VALUE)
    private String priceUnitTitleJa;

    @Column(name = "priceunittitle_en", length = Integer.MAX_VALUE)
    private String priceUnitTitleEn;

    @Column(name = "priceunitname_ja", length = Integer.MAX_VALUE)
    private String priceUnitNameJa;

    @Column(name = "priceunitname_en", length = Integer.MAX_VALUE)
    private String priceUnitNameEn;

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

    @NotNull
    @ColumnDefault("false")
    @Column(name = "display_top_ja", nullable = false)
    private Boolean displayTopJa = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "display_top_en", nullable = false)
    private Boolean displayTopEn = false;

}
