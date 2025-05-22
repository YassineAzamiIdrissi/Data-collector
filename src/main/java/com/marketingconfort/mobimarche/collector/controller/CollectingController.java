package com.marketingconfort.mobimarche.collector.controller;

import com.marketingconfort.mobimarche.collector.services.TenderDtoGetterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("collection")
@RequiredArgsConstructor
public class CollectingController {
    private final TenderDtoGetterService service;

    @PostMapping("")
    ResponseEntity<?> saveTenders(
            @RequestParam(name = "year") String year,
            @RequestParam(name = "limit") String limit,
            @RequestParam(name = "offset") String offset
    ) {
        service.getTendersByYear(year, limit, offset);
        return ResponseEntity.ok().
                build();
    }
}
