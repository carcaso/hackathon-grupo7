package org.academiadecodigo.hackathon.help7hearts.persistence.dao.jpa;

import org.academiadecodigo.hackathon.help7hearts.persistence.dao.Dao;
import org.academiadecodigo.hackathon.help7hearts.persistence.model.Model;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericJpaDao<T extends Model> implements Dao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<T> findAll() {

        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);

        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }

    public void delete(Integer id) {

    }
}
