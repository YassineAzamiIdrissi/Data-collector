package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class  Descripteur {
    @Getter
    @Setter
    @JsonProperty("CODE")
    String code ;
    @Getter
    @Setter
    @JsonProperty("LIBELLE")
    String lebelle ;
}
