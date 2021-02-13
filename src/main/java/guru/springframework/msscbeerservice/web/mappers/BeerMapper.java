package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto entityToBeerDto(Beer beer);
    Beer BeerDtoToEntity(BeerDto beerDto);

}
