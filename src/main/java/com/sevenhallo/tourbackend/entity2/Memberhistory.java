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
@Table(name = "memberhistory", schema = "dbo")
public class Memberhistory {
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

    @Size(max = 10)
    @Column(name = "displaymemberid", length = 10)
    private String displaymemberid;

    @Size(max = 128)
    @NotNull
    @Column(name = "applicationuserid", nullable = false, length = 128)
    private String applicationuserid;

    @Size(max = 20)
    @NotNull
    @Column(name = "familyname", nullable = false, length = 20)
    private String familyname;

    @Size(max = 20)
    @NotNull
    @Column(name = "firstname", nullable = false, length = 20)
    private String firstname;

    @Size(max = 20)
    @Column(name = "familynamekana", length = 20)
    private String familynamekana;

    @Size(max = 20)
    @Column(name = "firstnamekana", length = 20)
    private String firstnamekana;

    @Column(name = "birthday")
    private Instant birthday;

    @Column(name = "sex")
    private Integer sex;

    @NotNull
    @Column(name = "countrycode", nullable = false)
    private Integer countrycode;

    @Size(max = 20)
    @NotNull
    @Column(name = "postcode", nullable = false, length = 20)
    private String postcode;

    @Size(max = 200)
    @NotNull
    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Size(max = 20)
    @NotNull
    @Column(name = "tel", nullable = false, length = 20)
    private String tel;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellphone;

    @Size(max = 200)
    @NotNull
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @NotNull
    @Column(name = "canspeakjapanese", nullable = false)
    private Boolean canspeakjapanese = false;

    @NotNull
    @Column(name = "onetime", nullable = false)
    private Boolean onetime = false;

    @NotNull
    @Column(name = "language", nullable = false)
    private Integer language;

    @NotNull
    @Column(name = "applicationroletype", nullable = false)
    private Integer applicationroletype;

    @Size(max = 10)
    @Column(name = "agentcode", length = 10)
    private String agentcode;

    @NotNull
    @Column(name = "sendmailpaymentflag", nullable = false)
    private Integer sendmailpaymentflag;

    @Size(max = 20)
    @Column(name = "fax", length = 20)
    private String fax;

    @NotNull
    @Column(name = "stopuseflag", nullable = false)
    private Boolean stopuseflag = false;

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

    @Column(name = "branchname_ja", length = Integer.MAX_VALUE)
    private String branchnameJa;

    @Column(name = "branchname_en", length = Integer.MAX_VALUE)
    private String branchnameEn;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @Column(name = "vegetarianismflag")
    private Integer vegetarianismflag;

    @Column(name = "vegetarianismmeetflag")
    private Boolean vegetarianismmeetflag;

    @Column(name = "vegetarianismfishflag")
    private Boolean vegetarianismfishflag;

    @Column(name = "vegetarianismseafoodflag")
    private Boolean vegetarianismseafoodflag;

    @Column(name = "vegetarianismbonitostockflag")
    private Boolean vegetarianismbonitostockflag;

    @Column(name = "vegetarianismdairyproductsflag")
    private Boolean vegetarianismdairyproductsflag;

    @Column(name = "vegetarianismeggflag")
    private Boolean vegetarianismeggflag;

    @Column(name = "glutenfreeflag")
    private Integer glutenfreeflag;

    @Column(name = "glutenfreesoyproductsflag")
    private Integer glutenfreesoyproductsflag;

    @Column(name = "allergyflag")
    private Integer allergyflag;

    @Column(name = "allergyremarks", length = Integer.MAX_VALUE)
    private String allergyremarks;

    @Column(name = "dietaryrestflag")
    private Integer dietaryrestflag;

    @Column(name = "dietaryrestaflag")
    private Boolean dietaryrestaflag;

    @Column(name = "dietaryrestbflag")
    private Boolean dietaryrestbflag;

    @Column(name = "dietaryrestcflag")
    private Boolean dietaryrestcflag;

    @Column(name = "dietaryrestdflag")
    private Boolean dietaryrestdflag;

    @Column(name = "dietaryrestotherflag")
    private Boolean dietaryrestotherflag;

    @Column(name = "dietaryrest", length = Integer.MAX_VALUE)
    private String dietaryrest;

    @Size(max = 20)
    @Column(name = "middlename", length = 20)
    private String middlename;

    @Size(max = 20)
    @Column(name = "middlenamekana", length = 20)
    private String middlenamekana;

}