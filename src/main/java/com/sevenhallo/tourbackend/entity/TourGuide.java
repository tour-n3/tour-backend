package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TourGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String avatarUrl;

    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
}