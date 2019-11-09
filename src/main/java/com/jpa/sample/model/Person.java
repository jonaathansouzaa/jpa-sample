package com.jpa.sample.model;

import javax.persistence.*;

@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    @Column(name = "name")
    private String name;

    @Column(name = "cpf")
    private String cpf;

    public Person() {
    }

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
