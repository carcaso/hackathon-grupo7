package org.academiadecodigo.hackathon.help7hearts.controllers.rest;


import org.academiadecodigo.hackathon.help7hearts.exception.CharityNotFoundException;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.academiadecodigo.hackathon.help7hearts.services.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/charity")
public class RestCharityController {

    private CharityService charityService;

    @Autowired
    public void setCharityService(CharityService charityService) {
        this.charityService = charityService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Charity> showCharity(@PathVariable Integer id){

        Charity charity = charityService.get(id);

        if (charity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(charity, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public ResponseEntity<List<Charity>> listCharities() {

        List<Charity> charities = charityService.list();

        return new ResponseEntity<>(charities, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public ResponseEntity<HttpStatus> deleteCharity(@PathVariable Integer id) throws CharityNotFoundException {

        if(charityService.get(id) != null){
            charityService.delete(id);
        }

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public ResponseEntity<Charity> updateCharity(@RequestBody Charity charityData, @PathVariable Integer id){

        Charity charity = charityService.get(id);

        charity.setName( charityData.getName() );
        charity.setLocation( charityData.getLocation() );
        charity.setCategory( charityData.getCategory() );
        charity.setDescription( charityData.getDescription() );
        charity.setHasDonationDemand( charityData.getHasDonationDemand() );
        charity.setHasVolunteeringDemand( charityData.getHasVolunteeringDemand() );
        charity.setEmail( charityData.getEmail() );
        charity.setPhone( charityData.getPhone() );

        return new ResponseEntity<>(charity, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"", "/"})
    public ResponseEntity<Charity> addCharity(@RequestBody Charity charityData){

        Charity charity = new Charity();

        charity.setName( charityData.getName() );
        charity.setLocation( charityData.getLocation() );
        charity.setCategory( charityData.getCategory() );
        charity.setDescription( charityData.getDescription() );
        charity.setHasDonationDemand( charityData.getHasDonationDemand() );
        charity.setHasVolunteeringDemand( charityData.getHasVolunteeringDemand() );
        charity.setEmail( charityData.getEmail() );
        charity.setPhone( charityData.getPhone() );

        return new ResponseEntity<>(charity, HttpStatus.OK);
    }

}
