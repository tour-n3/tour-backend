package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TourBooker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String avatarUrl;

    private int guests;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
}