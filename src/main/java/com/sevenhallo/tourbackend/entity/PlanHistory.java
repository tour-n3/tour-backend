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
public class PlanHistory {
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
    @Column(name = "contentsid", nullable = false)
    private Integer contentsId;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @Column(name = "detail_ja", length = Integer.MAX_VALUE)
    private String detailJa;

    @Column(name = "detail_en", length = Integer.MAX_VALUE)
    private String detailEn;

    @Column(name = "messagetomember_ja", length = Integer.MAX_VALUE)
    private String messageToMemberJa;

    @Column(name = "messagetomember_en", length = Integer.MAX_VALUE)
    private String messageToMemberEn;

    @NotNull
    @Column(name = "roomflag", nullable = false)
    private Integer roomFlag;

    @NotNull
    @Column(name = "stockdisplayflag", nullable = false)
    private Integer stockDisplayFlag;

    @NotNull
    @Column(name = "pricetype", nullable = false)
    private Integer priceType;

    @NotNull
    @Column(name = "perpiecemin", nullable = false)
    private Integer perPieceMin;

    @NotNull
    @Column(name = "perpiecemax", nullable = false)
    private Integer perPieceMax;

    @NotNull
    @Column(name = "planroomdisplaytype", nullable = false)
    private Integer planRoomDisplayType;

    @NotNull
    @Column(name = "postspanstart", nullable = false)
    private LocalDate postSpanStart;

    @Column(name = "postspanend")
    private LocalDate postSpanEnd;

    @NotNull
    @Column(name = "availablespanstart", nullable = false)
    private Instant availableSpanStart;

    @Column(name = "availablespanend")
    private Instant availableSpanEnd;

    @Column(name = "bookablespandayagostart")
    private Integer bookableSpanDayAgoStart;

    @Column(name = "bookablespandayagostarttime")
    private Integer bookableSpanDayAgoStartTime;

    @Column(name = "bookablespandayagoend")
    private Integer bookableSpanDayAgoEnd;

    @Column(name = "bookablespandayagoendtime")
    private Integer bookableSpanDayAgoEndTime;

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
    private Integer displayKumanoKodoPageFlag;

    @NotNull
    @Column(name = "orderno", nullable = false)
    private Integer orderNo;

    @Column(name = "searchprice")
    private Integer searchPrice;

    @Column(name = "arrangementmemo", length = Integer.MAX_VALUE)
    private String arrangementMemo;

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
    @Column(name = "vegetarianismflag", nullable = false)
    private Integer vegetarianismFlag;

    @NotNull
    @Column(name = "vegetarianismflaga", nullable = false)
    private Boolean vegetarianismFlagA = false;

    @NotNull
    @Column(name = "vegetarianismflagb", nullable = false)
    private Boolean vegetarianismFlagB = false;

    @NotNull
    @Column(name = "vegetarianismflagc", nullable = false)
    private Boolean vegetarianismFlagC = false;

    @NotNull
    @Column(name = "vegetarianismflagd", nullable = false)
    private Boolean vegetarianismFlagD = false;

    @NotNull
    @Column(name = "vegetarianismflage", nullable = false)
    private Boolean vegetarianismFlagE = false;

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

    @Column(name = "messagetosupplier_ja", length = Integer.MAX_VALUE)
    private String messageToSupplierJa;

    @Column(name = "messagetosupplier_en", length = Integer.MAX_VALUE)
    private String messageToSupplierEn;

    @Column(name = "priceunittitle_ja", length = Integer.MAX_VALUE)
    private String priceUnitTitleJa;

    @Column(name = "priceunittitle_en", length = Integer.MAX_VALUE)
    private String priceUnitTitleEn;

    @Column(name = "priceunitname_ja", length = Integer.MAX_VALUE)
    private String priceUnitNameJa;

    @Column(name = "priceunitname_en", length = Integer.MAX_VALUE)
    private String priceUnitNameEn;

    @Column(name = "unavailablespanstart")
    private Instant unavailableSpanStart;

    @Column(name = "unavailablespanend")
    private Instant unavailableSpanEnd;

    @Column(name = "searchpricemax")
    private Integer searchPriceMax;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "selectallagentflag", nullable = false)
    private Boolean selectAllAgentFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "displayticket", nullable = false)
    private Boolean displayTicket = false;

    @Column(name = "ticketmemotemplate_ja", length = Integer.MAX_VALUE)
    private String ticketMemoTemplateJa;

    @Column(name = "ticketmemotemplate_en", length = Integer.MAX_VALUE)
    private String ticketMemoTemplateEn;

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
    @Column(name = "visibleflag", nullable = false)
    private Integer visibleFlag;

    @NotNull
    @Column(name = "topdisp", nullable = false)
    private Integer topDisp;

}
