package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.exceptions.NotFoundException;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import guru.springframework.msscbeerservice.web.mappers.BeerMapper;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;


    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.entityToBeerDto(
                beerRepository.findById(beerId).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        Beer savedBeer = beerRepository.save(beerMapper.BeerDtoToEntity(beerDto));
        return beerMapper.entityToBeerDto(savedBeer);
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        Beer beerFound = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        //todo: if does not work properly - perfrom manual set of the beerFound properties
        beerFound = beerMapper.BeerDtoToEntity(beerDto);

        beerRepository.save(beerFound);

        return beerMapper.entityToBeerDto(beerFound);
    }
}
