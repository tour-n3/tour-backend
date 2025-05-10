package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationuserlogin", schema = "dbo")
public class Applicationuserlogin {
    @EmbeddedId
    private ApplicationuserloginId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identityuser_id")
    private Applicationuser identityuser;

    @Column(name = "providerdisplayname", length = Integer.MAX_VALUE)
    private String providerdisplayname;

}