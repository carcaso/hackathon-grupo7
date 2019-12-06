package org.academiadecodigo.hackathon.help7hearts.controllers.rest;


import org.academiadecodigo.hackathon.help7hearts.converters.CharityDtoToCharity;
import org.academiadecodigo.hackathon.help7hearts.converters.CharityToCharityDto;
import org.academiadecodigo.hackathon.help7hearts.dto.CharityDto;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.academiadecodigo.hackathon.help7hearts.services.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/charity")
public class RestCharityController {

    private CharityService charityService;
    private CharityDtoToCharity charityDtoToCharity;
    private CharityToCharityDto charityToCharityDto;

    @Autowired
    public void setCharityService(CharityService charityService) {
        this.charityService = charityService;
    }

    @Autowired
    public void setCharityDtoToCharity(CharityDtoToCharity charityDtoToCharity) {
        this.charityDtoToCharity = charityDtoToCharity;
    }

    @Autowired
    public void setCharityToCharityDto(CharityToCharityDto charityToCharityDto) {
        this.charityToCharityDto = charityToCharityDto;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/{id}"})
    public ResponseEntity<CharityDto> showCharity(@PathVariable Integer id) {

        Charity charity = charityService.get(id);

        if (charity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        CharityDto charityDto = charityToCharityDto.convert(charity);

        return new ResponseEntity<>(charityDto, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public ResponseEntity<List<CharityDto>> listCharities() {

        List<Charity> charities = charityService.list();
        List<CharityDto> charitiesDto = charityToCharityDto.convert(charities);

        return new ResponseEntity<>(charitiesDto, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/{id}"})
    public ResponseEntity deleteCharity(@PathVariable Integer id) {

        if (charityService.get(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        try {
            charityService.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"add"})
    public ResponseEntity addCharity(@PathVariable CharityDto charityDto, UriComponentsBuilder uriComponentsBuilder) {


        List<Charity> charities = charityService.list();

        // Check for duplicate entries
        for (Charity charity : charities) {
            if(charity.getName().toLowerCase().equals(charityDto.getName().toLowerCase())){
                return new ResponseEntity(HttpStatus.CONFLICT);
            }
        }

        Charity charity = charityService.save(charityDtoToCharity.convert(charityDto));


        UriComponents uriComponents = uriComponentsBuilder.path("/charity/"+charity.getId()).build();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uriComponents.toUri());


        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
