package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Valeur {
    @Getter
    @Setter
    @JsonProperty("@DEVISE")
    private String devise;
    @Getter
    @Setter
    @JsonProperty("#text")
    private String text;
}