package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationuserclaim", schema = "dbo")
public class Applicationuserclaim {
    @EmbeddedId
    private ApplicationuserclaimId id;

    @Column(name = "claimtype", length = Integer.MAX_VALUE)
    private String claimtype;

    @Column(name = "claimvalue", length = Integer.MAX_VALUE)
    private String claimvalue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identityuser_id")
    private Applicationuser identityuser;

}