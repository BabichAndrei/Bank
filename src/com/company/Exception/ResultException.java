package com.company.Exception;

public class ResultException extends Exception{
    private boolean result;

    public boolean isResult() {
        return result;
    }

    public ResultException(String mes, boolean res){
        super(mes);
        result = res;
    }
}