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
@Table(name = "traveler", schema = "dbo")
public class Traveler {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "requestid", nullable = false)
    private Integer requestid;

    @NotNull
    @Column(name = "representativeflag", nullable = false)
    private Boolean representativeflag = false;

    @Size(max = 20)
    @Column(name = "familyname", length = 20)
    private String familyname;

    @Size(max = 20)
    @Column(name = "firstname", length = 20)
    private String firstname;

    @Size(max = 20)
    @Column(name = "familynamekana", length = 20)
    private String familynamekana;

    @Size(max = 20)
    @Column(name = "firstnamekana", length = 20)
    private String firstnamekana;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "countrycode")
    private Integer countrycode;

    @NotNull
    @Column(name = "canspeakjapanese", nullable = false)
    private Boolean canspeakjapanese = false;

    @Column(name = "dietaryrest", length = Integer.MAX_VALUE)
    private String dietaryrest;

    @Column(name = "remarks", length = Integer.MAX_VALUE)
    private String remarks;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

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
    @Column(name = "groupno", nullable = false)
    private Integer groupno;

    @NotNull
    @Column(name = "\"order\"", nullable = false)
    private Integer order;

    @Size(max = 20)
    @Column(name = "middlename", length = 20)
    private String middlename;

    @Size(max = 20)
    @Column(name = "middlenamekana", length = 20)
    private String middlenamekana;

    @Column(name = "birthday")
    private Instant birthday;

    @Size(max = 20)
    @Column(name = "tel", length = 20)
    private String tel;

    @Size(max = 20)
    @Column(name = "cellphone", length = 20)
    private String cellphone;

    @Size(max = 200)
    @Column(name = "email", length = 200)
    private String email;

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

    @Column(name = "allergyremarks", length = Integer.MAX_VALUE)
    private String allergyremarks;

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
    @Column(name = "dietaryrestotherflag", nullable = false)
    private Boolean dietaryrestotherflag = false;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "dammydataflag", nullable = false)
    private Boolean dammydataflag = false;

}