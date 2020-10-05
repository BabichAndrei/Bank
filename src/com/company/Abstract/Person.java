package com.company.Abstract;

import com.company.Exception.ResultException;

public abstract class Person {
    private  String name;
    private  String surname;
    private int balance;


    protected Person(String name, String surname, int balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void display() throws ResultException;
}
