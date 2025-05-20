package com.marketingconfort.mobimarche.collector.dto;

import com.marketingconfort.mobimarche.collector.models.Tender;
import lombok.Data;


@Data
public class AnnonceDTO {
   private Integer id;
   private String annonce;
   private Tender tender;
}
