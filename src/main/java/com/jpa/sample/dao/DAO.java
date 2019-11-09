package com.jpa.sample.dao;

import java.util.List;

public interface DAO<T> {

    public void save(T entity);

    public void update(T entity);

    public void delete(T entity);

    public T findById();

    public List<T> findAll();

}
