package org.academiadecodigo.hackathon.help7hearts.persistence.dao.jpa;

import org.academiadecodigo.hackathon.help7hearts.persistence.dao.FieldDao;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Field;
import org.springframework.stereotype.Repository;

@Repository
public class FieldDaoJPA extends GenericJpaDao<Field> implements FieldDao {

    public FieldDaoJPA(Class<Field> modelType) {
        super(Field.class);
    }
}
