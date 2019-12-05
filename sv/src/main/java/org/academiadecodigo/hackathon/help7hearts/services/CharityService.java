package org.academiadecodigo.hackathon.help7hearts.services;

import org.academiadecodigo.hackathon.help7hearts.exception.CharityNotFoundException;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;

import java.util.List;

public interface CharityService {

    Charity get(Integer id);

    Charity save(Charity charity);

    void delete(Integer id) throws CharityNotFoundException;

    List<Charity> list();
}
