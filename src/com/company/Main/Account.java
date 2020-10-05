package com.company.Main;

import com.company.Abstract.Person;
import com.company.Interface.IAccount;

public class Account implements IAccount {

    @Override
    // метод определяет, есть ли на балансе средства
    public boolean isBalance() {


        return true;
    }

    @Override
    //метод определяет, был ли сделан перевод средств
    public boolean isTransfer(){
        //Реализация некоторой логики
        //Для примера возращает "false"
        return false;
    }



}
