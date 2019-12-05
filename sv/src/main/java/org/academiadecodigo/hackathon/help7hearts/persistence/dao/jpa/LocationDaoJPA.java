package org.academiadecodigo.hackathon.help7hearts.persistence.dao.jpa;

import org.academiadecodigo.hackathon.help7hearts.persistence.dao.LocationDao;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Location;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDaoJPA extends GenericJpaDao<Location> implements LocationDao {

    public LocationDaoJPA() {
        super(Location.class);
    }
}
