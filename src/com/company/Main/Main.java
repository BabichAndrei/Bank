package com.company.Main;

import com.company.Exception.ResultException;

public class Main {

    public static void main(String[] args) {
        try {
            Client client = new Client("Andrey ", "Babich", 100);
            client.display();
        } catch (ResultException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.isResult());
        }

    }
}
