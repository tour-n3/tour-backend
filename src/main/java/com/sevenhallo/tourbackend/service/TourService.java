package com.sevenhallo.tourbackend.service;

import com.sevenhallo.tourbackend.dto.TourDto;
import com.sevenhallo.tourbackend.entity.Tour;
import com.sevenhallo.tourbackend.mapper.TourMapper;
import com.sevenhallo.tourbackend.repository.TourRepository;
import com.sevenhallo.tourbackend.exception.ResourceNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class TourService {
    private final TourRepository repository;
    private final TourMapper tourMapper;

    public TourService(TourRepository repository, TourMapper tourMapper) {
        this.repository = repository;
        this.tourMapper = tourMapper;
    }

    public TourDto save(TourDto tourDto) {
        Tour entity = tourMapper.toEntity(tourDto);
        return tourMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public TourDto findById(Long id) {
        return tourMapper.toDto(repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tour not found with id: " + id)));
    }

    public Page<TourDto> findByCondition(TourDto tourDto, Pageable pageable) {
        Page<Tour> entityPage = repository.findAll(pageable);
        List<Tour> entities = entityPage.getContent();
        return new PageImpl<>(tourMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public TourDto update(TourDto tourDto, Long id) {
        TourDto data = findById(id);
        Tour entity = tourMapper.toEntity(tourDto);
        BeanUtils.copyProperties(data, entity);
        return save(tourMapper.toDto(entity));
    }
}
