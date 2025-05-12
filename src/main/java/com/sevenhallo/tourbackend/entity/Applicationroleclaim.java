package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationroleclaim", schema = "dbo")
public class ApplicationRoleClaim {
    @EmbeddedId
    private ApplicationRoleClaimId id;

    @Column(name = "claimtype", length = Integer.MAX_VALUE)
    private String claimType;

    @Column(name = "claimvalue", length = Integer.MAX_VALUE)
    private String claimValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identityrole_id")
    private ApplicationRole identityRole;

}
