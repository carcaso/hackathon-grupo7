package org.academiadecodigo.hackathon.help7hearts.services;

import org.academiadecodigo.hackathon.help7hearts.exception.CharityNotFoundException;
import org.academiadecodigo.hackathon.help7hearts.persistence.dao.CharityDao;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CharityServcieImpl implements CharityService {

    private CharityDao charityDao;

    @Autowired
    public void setCharityDao(CharityDao charityDao) {
        this.charityDao = charityDao;
    }

    @Override
    public Charity get(Integer id) {
        return charityDao.findById(id);
    }

    @Transactional
    @Override
    public Charity save(Charity charity) {
        return charityDao.saveOrUpdate(charity);
    }

    @Transactional
    @Override
    public void delete(Integer id) throws CharityNotFoundException {

    }

    @Override
    public List<Charity> list() {

        return charityDao.findAll();
    }
}
