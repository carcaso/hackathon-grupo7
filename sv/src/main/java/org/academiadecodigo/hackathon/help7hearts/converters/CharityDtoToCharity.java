package org.academiadecodigo.hackathon.help7hearts.converters;

import org.academiadecodigo.hackathon.help7hearts.dto.CharityDto;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.academiadecodigo.hackathon.help7hearts.services.CharityServcieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CharityDtoToCharity extends AbstractConverter<CharityDto, Charity> {

    private CharityServcieImpl charityService;

    @Autowired
    public void setCharityService(CharityServcieImpl charityService) {
        this.charityService = charityService;
    }

    @Override
    public Charity convert(CharityDto charityDto) {

        Charity charity = (charityDto.getId() != null ? charityService.get(charityDto.getId()) : new Charity());

        charity.setName(charityDto.getName());
        charity.setDescription(charityDto.getDescription());
        charity.setCategory(charityDto.getCategory());
        charity.setLocation(charityDto.getLocation());
        charity.setEmail(charityDto.getEmail());
        charity.setPhone(charityDto.getPhone());
        charity.setHasDonationDemand(charityDto.isHasDonationsDemand());
        charity.setHasVolunteeringDemand(charityDto.isHasVolunteersDemand());
        charity.setUrl(charityDto.getUrl());
        charity.setLogoUrl(charityDto.getLogo());

        return charity;
    }
}
