package com.company.Main;

import com.company.Interface.IOutput;

public class Output implements IOutput {

    @Override
    public void WriteMessage(String val) {
        System.out.print(val);
    }

    @Override
    public void WriteMessage(String val1, String val2, String val3, boolean val4, String val5, boolean val6) {
        System.out.printf(val1, val2, val3, val4, val5, val6);
    }
}
