package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marketingconfort.mobimarche.collector.models.Lot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class ValeurDTO {
    @JsonIgnore
    private Integer id;
    private String devise;
    private String text;

}
