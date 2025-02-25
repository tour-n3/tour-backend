package com.sevenhallo.tourbackend.dto;

import com.sevenhallo.tourbackend.annotation.CheckDate;
import com.sevenhallo.tourbackend.entity.Tour;
import com.sevenhallo.tourbackend.entity.TourBooker;
import com.sevenhallo.tourbackend.entity.TourGuide;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ApiModel()
public class TourDto extends AbstractDto<Long> {
    private Long id;
    private String name;
    private double price;
    private int totalViews;
    private List<String> tags;
    private String content;
    private String publish;
    private List<String> images;
    private String durations;
    private double priceSale;
    private List<String> services;
    private String destination;
    private double ratingNumber;
    private List<TourBooker> bookers;
    private List<TourGuide> tourGuides;
    @CheckDate
    private Date createdAt;
    private Tour.Available available;
}