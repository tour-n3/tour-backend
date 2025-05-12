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

@Getter
@Setter
@Entity
@Table(name = "contentshistory", schema = "dbo")
public class ContentsHistory {
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
    @Column(name = "contentstype", nullable = false)
    private Integer contentsType;

    @Column(name = "name_ja", length = Integer.MAX_VALUE)
    private String nameJa;

    @Column(name = "name_en", length = Integer.MAX_VALUE)
    private String nameEn;

    @Column(name = "catchcopy_ja", length = Integer.MAX_VALUE)
    private String catchcopyJa;

    @Column(name = "catchcopy_en", length = Integer.MAX_VALUE)
    private String catchcopyEn;

    @Column(name = "detail_ja", length = Integer.MAX_VALUE)
    private String detailJa;

    @Column(name = "detail_en", length = Integer.MAX_VALUE)
    private String detailEn;

    @NotNull
    @Column(name = "visibleflag", nullable = false)
    private Boolean visibleFlag = false;

    @Column(name = "address_ja", length = Integer.MAX_VALUE)
    private String addressJa;

    @Column(name = "address_en", length = Integer.MAX_VALUE)
    private String addressEn;

    @Size(max = 20)
    @Column(name = "tel", length = 20)
    private String tel;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellphone;

    @Size(max = 20)
    @Column(name = "fax", length = 20)
    private String fax;

    @Size(max = 250)
    @Column(name = "mail", length = 250)
    private String mail;

    @Size(max = 250)
    @Column(name = "submail", length = 250)
    private String submail;

    @NotNull
    @Column(name = "displaykumanokodopageflag", nullable = false)
    private Integer displayKumanoKodoPageFlag;

    @NotNull
    @Column(name = "releasetelflag", nullable = false)
    private Boolean releaseTelFlag = false;

    @NotNull
    @Column(name = "releasefaxflag", nullable = false)
    private Boolean releaseFaxFlag = false;

    @NotNull
    @Column(name = "releasemailflag", nullable = false)
    private Boolean releaseMailFlag = false;

    @NotNull
    @Column(name = "sendfaxflag", nullable = false)
    private Integer sendFaxFlag;

    @NotNull
    @Column(name = "sendmailflag", nullable = false)
    private Integer sendMailFlag;

    @NotNull
    @Column(name = "sendmailapprovalrequestflag", nullable = false)
    private Integer sendMailApprovalRequestFlag;

    @NotNull
    @Column(name = "language_ja", nullable = false)
    private Boolean languageJa = false;

    @NotNull
    @Column(name = "language_en", nullable = false)
    private Boolean languageEn = false;

    @Size(max = 100)
    @Column(name = "urlcode", length = 100)
    private String urlCode;

    @Size(max = 20)
    @Column(name = "supplierid", length = 20)
    private String supplierId;

    @NotNull
    @Column(name = "sendmailconfirmflag", nullable = false)
    private Integer sendMailConfirmFlag;

    @NotNull
    @Column(name = "stockflag", nullable = false)
    private Integer stockFlag;

    @Size(max = 20)
    @Column(name = "mapcode", length = 20)
    private String mapCode;

    @Size(max = 500)
    @Column(name = "googlemap", length = 500)
    private String googlemap;

    @Size(max = 500)
    @Column(name = "areamap", length = 500)
    private String areamap;

    @Size(max = 500)
    @Column(name = "kumanokodomap", length = 500)
    private String kumanokodomap;

    @NotNull
    @Column(name = "contentsdetailtitleviewtype", nullable = false)
    private Integer contentsDetailTitleViewType;

    @Column(name = "checkinstarthour")
    private Integer checkInStartHour;

    @Column(name = "checkinstartminute")
    private Integer checkInStartMinute;

    @Column(name = "checkinendhour")
    private Integer checkInEndHour;

    @Column(name = "checkinendminute")
    private Integer checkInEndMinute;

    @Column(name = "checkouthour")
    private Integer checkOutHour;

    @Column(name = "checkoutminute")
    private Integer checkOutMinute;

    @Column(name = "curfewhour")
    private Integer curfewHour;

    @Column(name = "curfewminute")
    private Integer curfewMinute;

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
    @ColumnDefault("0")
    @Column(name = "contactflag", nullable = false)
    private Integer contactFlag;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "stockeditflag", nullable = false)
    private Boolean stockEditFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "pricepatterneditflag", nullable = false)
    private Boolean pricePatternEditFlag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "paidtosupplierinfoflag", nullable = false)
    private Boolean paidToSupplierInfoFlag = false;

    @NotNull
    @Column(name = "adminmemotype", nullable = false)
    private Integer adminMemoType;

    @NotNull
    @Column(name = "sendfaxconfirmflag", nullable = false)
    private Integer sendFaxConfirmFlag;

    @Column(name = "adminmemo", length = Integer.MAX_VALUE)
    private String adminMemo;

    @Column(name = "adminmemoupdatedate")
    private Instant adminMemoUpdateDate;

    @Size(max = 128)
    @Column(name = "adminmemoupdateuserid", length = 128)
    private String adminMemoUpdateUserId;

    @NotNull
    @Column(name = "sendfaxapprovalrequestflag", nullable = false)
    private Integer sendFaxApprovalRequestFlag;

}
