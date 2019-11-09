package com.jpa.sample;

import com.jpa.sample.dao.PersonDAO;
import com.jpa.sample.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppCoonection {

    public static void main(String[] args) {        
        PersonDAO dao = new PersonDAO();
        dao.save(new Person("Jonathan Souza", "00000000000"));
    }

}
