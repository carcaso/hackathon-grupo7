package org.academiadecodigo.hackathon.help7hearts.persistence.dao.jpa;

import org.academiadecodigo.hackathon.help7hearts.persistence.dao.Dao;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class GenericJpaDao<T extends Model> implements Dao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericJpaDao(Class<T> modelType){
        this.modelType = modelType;
    }

    public List<T> findAll() {
        return null;
    }

    public T findById(Integer id) {
        return null;
    }

    public T saveOrUpdate(T modelObject) {
        return null;
    }

    public void delete(Integer id) {

    }
}
