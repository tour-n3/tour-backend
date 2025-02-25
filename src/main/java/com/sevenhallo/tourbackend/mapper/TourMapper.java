package com.sevenhallo.tourbackend.mapper;

import com.sevenhallo.tourbackend.dto.TourDto;
import com.sevenhallo.tourbackend.entity.Tour;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TourMapper extends EntityMapper<TourDto, Tour> {
}