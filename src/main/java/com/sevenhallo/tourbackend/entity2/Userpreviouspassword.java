package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "userpreviouspassword", schema = "dbo")
public class Userpreviouspassword {
    @EmbeddedId
    private UserpreviouspasswordId id;

    @MapsId("userid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "userid", nullable = false)
    private Applicationuser userid;

    @NotNull
    @Column(name = "createdate", nullable = false)
    private OffsetDateTime createdate;

}