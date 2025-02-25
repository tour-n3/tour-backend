package com.sevenhallo.tourbackend.controller;

import com.sevenhallo.tourbackend.dto.TourDto;

import java.util.Collections;
import java.util.List;

public class TourBuilder {
    public static List<String> getIds() {
        return Collections.singletonList("1");
    }

    public static TourDto getDto() {
        TourDto dto = new TourDto();
        dto.setId("1");
        return dto;
    }
}
