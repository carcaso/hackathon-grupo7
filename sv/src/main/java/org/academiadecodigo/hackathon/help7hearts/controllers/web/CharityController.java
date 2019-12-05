package org.academiadecodigo.hackathon.help7hearts.controllers.web;

import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.academiadecodigo.hackathon.help7hearts.services.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/charity")
public class CharityController {

    private CharityService charityService;

    @Autowired
    public void setCharityService(CharityService charityService) {
        this.charityService = charityService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public String listCharities(Model model) {
        Charity charity = new Charity();
        charity.setName("Help the STRINGrays");
        charity.setDescription("Yay so good");
        charity.setEmail("wally");
        charityService.save(charity);
        return "list";
    }
}
