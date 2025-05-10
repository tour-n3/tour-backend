package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "applicationusertoken", schema = "dbo")
public class Applicationusertoken {
    @EmbeddedId
    private ApplicationusertokenId id;

    @MapsId("userid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    private Applicationuser userid;

    @Size(max = 128)
    @Column(name = "value", length = 128)
    private String value;

}