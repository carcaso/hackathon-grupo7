package org.academiadecodigo.hackathon.help7hearts.converters;

import org.academiadecodigo.hackathon.help7hearts.dto.CharityDto;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.springframework.stereotype.Component;

@Component
public class CharityToCharityDto extends AbstractConverter<Charity, CharityDto> {

    @Override
    public CharityDto convert(Charity charity) {

        CharityDto charityDto = new CharityDto();

        charityDto.setId(charity.getId());

        charityDto.setName(charity.getName());
        charityDto.setCategory(charity.getCategory());
        charityDto.setLocation(charity.getLocation());
        charityDto.setEmail(charity.getEmail());

        charityDto.setHasVolunteersDemand(charity.getHasVolunteeringDemand());
        charityDto.setHasDonationsDemand(charity.getHasDonationDemand());

        charityDto.setUrl(charity.getUrl());
        charityDto.setLogo(charity.getLogoUrl());

        return charityDto;
    }
}
