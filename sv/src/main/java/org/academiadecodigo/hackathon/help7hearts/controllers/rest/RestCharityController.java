package org.academiadecodigo.hackathon.help7hearts.controllers.rest;


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

    //@RequestMapping(method = RequestMethod.GET, path = {"/"})
    public ResponseEntity<Charity> showCharity(@PathVariable Integer id){

        Charity charity = charityService.get(id);

        /*if (charity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }*/

        return new ResponseEntity<>(charity, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public ResponseEntity<List<Charity>> listCharities() {

        List<Charity> charities = charityService.list();

        return new ResponseEntity<>(charities, HttpStatus.OK);
    }


}
