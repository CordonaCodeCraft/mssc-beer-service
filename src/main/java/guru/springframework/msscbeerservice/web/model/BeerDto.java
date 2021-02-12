package guru.springframework.msscbeerservice.web.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private BigDecimal price;

    private Integer quantityOnHand;

    @Null
    private Integer version;

    @Positive
    @NotNull
    private Long upc;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;




}
