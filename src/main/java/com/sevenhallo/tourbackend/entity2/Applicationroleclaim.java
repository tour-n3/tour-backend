package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationroleclaim", schema = "dbo")
public class Applicationroleclaim {
    @EmbeddedId
    private ApplicationroleclaimId id;

    @Column(name = "claimtype", length = Integer.MAX_VALUE)
    private String claimtype;

    @Column(name = "claimvalue", length = Integer.MAX_VALUE)
    private String claimvalue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identityrole_id")
    private Applicationrole identityrole;

}