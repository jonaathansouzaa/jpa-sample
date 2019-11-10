package com.jpa.sample.dao;

import com.jpa.sample.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PersonDAO implements DAO<Person> {

    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public void begin() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("codenation-pu");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    @Override
    public void save(Person entity) {
        begin();
        entityManager.persist(entity);
        close();
    }

    @Override
    public void update(Person entity) {
        begin();
        entityManager.persist(entity);
        close();
    }

    @Override
    public void delete(Person entity) {
        begin();
        entityManager.remove(entity);
        close();
    }

    @Override
    public Person findById(Long entityId) {
        begin();
        Person person = entityManager.find(Person.class, entityId);
        close();
        return person;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

}
