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

@Getter
@Setter
@Entity
@Table(name = "contentshistory", schema = "dbo")
public class Contentshistory {
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
    @Column(name = "contentstype", nullable = false)
    private Integer contentstype;

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
    private Boolean visibleflag = false;

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
    private Integer displaykumanokodopageflag;

    @NotNull
    @Column(name = "releasetelflag", nullable = false)
    private Boolean releasetelflag = false;

    @NotNull
    @Column(name = "releasefaxflag", nullable = false)
    private Boolean releasefaxflag = false;

    @NotNull
    @Column(name = "releasemailflag", nullable = false)
    private Boolean releasemailflag = false;

    @NotNull
    @Column(name = "sendfaxflag", nullable = false)
    private Integer sendfaxflag;

    @NotNull
    @Column(name = "sendmailflag", nullable = false)
    private Integer sendmailflag;

    @NotNull
    @Column(name = "sendmailapprovalrequestflag", nullable = false)
    private Integer sendmailapprovalrequestflag;

    @NotNull
    @Column(name = "language_ja", nullable = false)
    private Boolean languageJa = false;

    @NotNull
    @Column(name = "language_en", nullable = false)
    private Boolean languageEn = false;

    @Size(max = 100)
    @Column(name = "urlcode", length = 100)
    private String urlcode;

    @Size(max = 20)
    @Column(name = "supplierid", length = 20)
    private String supplierid;

    @NotNull
    @Column(name = "sendmailconfirmflag", nullable = false)
    private Integer sendmailconfirmflag;

    @NotNull
    @Column(name = "stockflag", nullable = false)
    private Integer stockflag;

    @Size(max = 20)
    @Column(name = "mapcode", length = 20)
    private String mapcode;

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
    private Integer contentsdetailtitleviewtype;

    @Column(name = "checkinstarthour")
    private Integer checkinstarthour;

    @Column(name = "checkinstartminute")
    private Integer checkinstartminute;

    @Column(name = "checkinendhour")
    private Integer checkinendhour;

    @Column(name = "checkinendminute")
    private Integer checkinendminute;

    @Column(name = "checkouthour")
    private Integer checkouthour;

    @Column(name = "checkoutminute")
    private Integer checkoutminute;

    @Column(name = "curfewhour")
    private Integer curfewhour;

    @Column(name = "curfewminute")
    private Integer curfewminute;

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
    @ColumnDefault("0")
    @Column(name = "contactflag", nullable = false)
    private Integer contactflag;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "stockeditflag", nullable = false)
    private Boolean stockeditflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "pricepatterneditflag", nullable = false)
    private Boolean pricepatterneditflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "paidtosupplierinfoflag", nullable = false)
    private Boolean paidtosupplierinfoflag = false;

    @NotNull
    @Column(name = "adminmemotype", nullable = false)
    private Integer adminmemotype;

    @NotNull
    @Column(name = "sendfaxconfirmflag", nullable = false)
    private Integer sendfaxconfirmflag;

    @Column(name = "adminmemo", length = Integer.MAX_VALUE)
    private String adminmemo;

    @Column(name = "adminmemoupdatedate")
    private Instant adminmemoupdatedate;

    @Size(max = 128)
    @Column(name = "adminmemoupdateuserid", length = 128)
    private String adminmemoupdateuserid;

    @NotNull
    @Column(name = "sendfaxapprovalrequestflag", nullable = false)
    private Integer sendfaxapprovalrequestflag;

}