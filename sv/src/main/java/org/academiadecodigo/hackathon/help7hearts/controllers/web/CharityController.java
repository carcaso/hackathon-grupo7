package org.academiadecodigo.hackathon.help7hearts.controllers.web;

import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.academiadecodigo.hackathon.help7hearts.services.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
        charity.setName("APADI");
        charity.setLocation("Portugal");
        charity.setCategory("Health");
        charity.setDescription("An association that helps people with low intelectual level");
        charity.setLogoUrl("http://www.apadi.pt/");
        charity.setUrl("http://www.apadi.pt/");
        charity.setHasDonationDemand(true);
        charity.setHasVolunteeringDemand(true);
        charityService.save(charity);
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/{id}"})
    public String showCharity(@PathVariable Integer id, Model model) throws Exception {

        Charity charity = charityService.get(id);
        return "/show";
    }
}
