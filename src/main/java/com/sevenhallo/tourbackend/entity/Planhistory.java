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
@Table(name = "planhistory", schema = "dbo")
public class Planhistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "historydata_targethistoryid", nullable = false)
    private Integer historydataTargethistoryid;

    @NotNull
    @Column(name = "historydata_enablestartdate", nullable = false)
    private Instant historydataEnablestartdate;

    @Column(name = "historydata_enableenddate")
    private Instant historydataEnableenddate;

    @NotNull
    @Column(name = "contentsid", nullable = false)
    private Integer contentsid;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @Column(name = "detail_ja", length = Integer.MAX_VALUE)
    private String detailJa;

    @Column(name = "detail_en", length = Integer.MAX_VALUE)
    private String detailEn;

    @Column(name = "messagetomember_ja", length = Integer.MAX_VALUE)
    private String messagetomemberJa;

    @Column(name = "messagetomember_en", length = Integer.MAX_VALUE)
    private String messagetomemberEn;

    @NotNull
    @Column(name = "roomflag", nullable = false)
    private Integer roomflag;

    @NotNull
    @Column(name = "stockdisplayflag", nullable = false)
    private Integer stockdisplayflag;

    @NotNull
    @Column(name = "pricetype", nullable = false)
    private Integer pricetype;

    @NotNull
    @Column(name = "perpiecemin", nullable = false)
    private Integer perpiecemin;

    @NotNull
    @Column(name = "perpiecemax", nullable = false)
    private Integer perpiecemax;

    @NotNull
    @Column(name = "planroomdisplaytype", nullable = false)
    private Integer planroomdisplaytype;

    @NotNull
    @Column(name = "postspanstart", nullable = false)
    private LocalDate postspanstart;

    @Column(name = "postspanend")
    private LocalDate postspanend;

    @NotNull
    @Column(name = "availablespanstart", nullable = false)
    private Instant availablespanstart;

    @Column(name = "availablespanend")
    private Instant availablespanend;

    @Column(name = "bookablespandayagostart")
    private Integer bookablespandayagostart;

    @Column(name = "bookablespandayagostarttime")
    private Integer bookablespandayagostarttime;

    @Column(name = "bookablespandayagoend")
    private Integer bookablespandayagoend;

    @Column(name = "bookablespandayagoendtime")
    private Integer bookablespandayagoendtime;

    @NotNull
    @Column(name = "recommended", nullable = false)
    private Boolean recommended = false;

    @NotNull
    @Column(name = "language_ja", nullable = false)
    private Boolean languageJa = false;

    @NotNull
    @Column(name = "language_en", nullable = false)
    private Boolean languageEn = false;

    @NotNull
    @Column(name = "displaykumanokodopageflag", nullable = false)
    private Integer displaykumanokodopageflag;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderno;

    @Column(name = "searchprice")
    private Integer searchprice;

    @Column(name = "arrangementmemo", length = Integer.MAX_VALUE)
    private String arrangementmemo;

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
    @Column(name = "vegetarianismflag", nullable = false)
    private Integer vegetarianismflag;

    @NotNull
    @Column(name = "vegetarianismflaga", nullable = false)
    private Boolean vegetarianismflaga = false;

    @NotNull
    @Column(name = "vegetarianismflagb", nullable = false)
    private Boolean vegetarianismflagb = false;

    @NotNull
    @Column(name = "vegetarianismflagc", nullable = false)
    private Boolean vegetarianismflagc = false;

    @NotNull
    @Column(name = "vegetarianismflagd", nullable = false)
    private Boolean vegetarianismflagd = false;

    @NotNull
    @Column(name = "vegetarianismflage", nullable = false)
    private Boolean vegetarianismflage = false;

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

    @Column(name = "messagetosupplier_ja", length = Integer.MAX_VALUE)
    private String messagetosupplierJa;

    @Column(name = "messagetosupplier_en", length = Integer.MAX_VALUE)
    private String messagetosupplierEn;

    @Column(name = "priceunittitle_ja", length = Integer.MAX_VALUE)
    private String priceunittitleJa;

    @Column(name = "priceunittitle_en", length = Integer.MAX_VALUE)
    private String priceunittitleEn;

    @Column(name = "priceunitname_ja", length = Integer.MAX_VALUE)
    private String priceunitnameJa;

    @Column(name = "priceunitname_en", length = Integer.MAX_VALUE)
    private String priceunitnameEn;

    @Column(name = "unavailablespanstart")
    private Instant unavailablespanstart;

    @Column(name = "unavailablespanend")
    private Instant unavailablespanend;

    @Column(name = "searchpricemax")
    private Integer searchpricemax;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "selectallagentflag", nullable = false)
    private Boolean selectallagentflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "displayticket", nullable = false)
    private Boolean displayticket = false;

    @Column(name = "ticketmemotemplate_ja", length = Integer.MAX_VALUE)
    private String ticketmemotemplateJa;

    @Column(name = "ticketmemotemplate_en", length = Integer.MAX_VALUE)
    private String ticketmemotemplateEn;

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
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleflag;

    @NotNull
    @Column(name = "topdisp", nullable = false)
    private Integer topdisp;

}