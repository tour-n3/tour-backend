package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationuserrole", schema = "dbo")
public class ApplicationUserRole {
    @EmbeddedId
    private ApplicationUserRoleId id;

    @Size(max = 128)
    @NotNull
    @Column(name = "discriminator", nullable = false, length = 128)
    private String discriminator;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "identityrole_id", nullable = false)
    private ApplicationRole identityRole;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "identityuser_id", nullable = false)
    private ApplicationUser identityUser;

}
