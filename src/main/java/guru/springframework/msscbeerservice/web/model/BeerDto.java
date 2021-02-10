package guru.springframework.msscbeerservice.web.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private BigDecimal price;
    private Integer quantityOnHand;
    private Integer version;
    private Long upc;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;




}
