package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class TenderResponseDTO {


    @JsonProperty("total_count")
    private int total_count;


    @JsonProperty("results")
    private List<TenderDTO> results;

}
