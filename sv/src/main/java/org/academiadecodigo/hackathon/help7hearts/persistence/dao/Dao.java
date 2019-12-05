package org.academiadecodigo.hackathon.help7hearts.persistence.dao;

import org.academiadecodigo.hackathon.help7hearts.persistence.model.Model;

import java.util.List;

public interface Dao<T extends Model> {

    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);
}
