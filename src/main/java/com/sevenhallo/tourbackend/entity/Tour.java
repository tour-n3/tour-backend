package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private int totalViews;

    @ElementCollection
    private List<String> tags;

    @Lob
    private String content;

    private String publish;

    @ElementCollection
    private List<String> images;

    private String durations; // Có thể cần type khác để xử lý thời lượng

    private double priceSale;

    @ElementCollection
    @CollectionTable(name = "tour_services", joinColumns = @JoinColumn(name = "tour_id"))
    @Column(name = "service")
    private List<String> services;

    private String destination;

    private double ratingNumber;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TourBooker> bookers;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TourGuide> tourGuides;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Embedded
    private Available available;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class Available {
        @Temporal(TemporalType.DATE)
        private Date startDate;

        @Temporal(TemporalType.DATE)
        private Date endDate;
    }
}