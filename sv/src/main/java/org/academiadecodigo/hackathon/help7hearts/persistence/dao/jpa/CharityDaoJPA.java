package org.academiadecodigo.hackathon.help7hearts.persistence.dao.jpa;

import org.academiadecodigo.hackathon.help7hearts.persistence.dao.CharityDao;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Charity;
import org.springframework.stereotype.Repository;

@Repository
public class CharityDaoJPA extends GenericJpaDao<Charity> implements CharityDao {


    public CharityDaoJPA() {
        super(Charity.class);
    }
}
