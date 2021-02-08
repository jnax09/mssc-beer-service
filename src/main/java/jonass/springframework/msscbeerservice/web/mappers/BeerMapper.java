package jonass.springframework.msscbeerservice.web.mappers;

import jonass.springframework.msscbeerservice.domain.Beer;
import jonass.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto (Beer beer);
    Beer beerDtoToBeer (BeerDto beerDto);
}
