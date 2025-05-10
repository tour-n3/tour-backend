package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "distributedcacheitems", schema = "dbo")
public class Distributedcacheitem {
    @Id
    @Column(name = "\"Id\"", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "\"Value\"")
    private byte[] value;

    @Column(name = "\"ExpiresAtTime\"")
    private OffsetDateTime expiresAtTime;

    @Column(name = "\"SlidingExpirationInSeconds\"")
    private Double slidingExpirationInSeconds;

    @Column(name = "\"AbsoluteExpiration\"")
    private OffsetDateTime absoluteExpiration;

}