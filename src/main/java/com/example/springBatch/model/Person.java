package com.example.springBatch.model;

public class Person {
    private String firstName;
    private String secondName;
    private String cpf;

    public Person() {
    }

    public Person(String firstName, String secondName, String cpf) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.cpf = cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}