package com.sevenhallo.tourbackend.controller;

import com.sevenhallo.tourbackend.dto.TourDto;
import com.sevenhallo.tourbackend.entity.Tour;
import com.sevenhallo.tourbackend.mapper.TourMapper;
import com.sevenhallo.tourbackend.exception.ResourceNotFoundException;
import com.sevenhallo.tourbackend.service.TourService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/tour")
@RestController
@Slf4j
@Api("tour")
public class TourController {
    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated TourDto tourDto) {
        tourService.save(tourDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourDto> findById(@PathVariable("id") Long id) {
        TourDto tour = tourService.findById(id);
        return ResponseEntity.ok(tour);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        Optional.ofNullable(tourService.findById(id)).orElseThrow(() -> {
            log.error("Unable to delete non-existent data!");
            return new ResourceNotFoundException("Resource with id " + id + " not found");
        });
        tourService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<TourDto>> pageQuery(TourDto tourDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<TourDto> tourPage = tourService.findByCondition(tourDto, pageable);
        return ResponseEntity.ok(tourPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated TourDto tourDto, @PathVariable("id") Long id) {
        tourService.update(tourDto, id);
        return ResponseEntity.ok().build();
    }
}
