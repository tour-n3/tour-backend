package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationuserlogin", schema = "dbo")
public class ApplicationUserLogin {
    @EmbeddedId
    private ApplicationUserLoginId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identityuser_id")
    private ApplicationUser identityUser;

    @Column(name = "providerdisplayname", length = Integer.MAX_VALUE)
    private String providerDisplayName;

}
