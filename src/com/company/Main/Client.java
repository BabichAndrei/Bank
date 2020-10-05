package com.company.Main;

import com.company.Abstract.Person;
import com.company.Exception.ResultException;
import com.company.Interface.IAccount;
import com.company.Interface.IOutput;

public class Client extends Person {

    protected Client(String name, String surname, int balance) {
        super(name, surname, balance);
    }

    IAccount iAccount = new Account();

    boolean resultIsBalance = iAccount.isBalance();
    boolean resultIsTransfer = iAccount.isTransfer();

    IOutput iOutput = new Output();

    @Override
    public void display() throws ResultException {
        if (!resultIsBalance && resultIsTransfer) throw new ResultException("Баланс пользователя отрицательный . Значение не может быть ", resultIsBalance);
        iOutput.WriteMessage(super.getName()  + super.getSurname() + "\nБаланс положительный: " + resultIsBalance + "\nПеревод совершен удачно: " + resultIsTransfer);
    }

}
