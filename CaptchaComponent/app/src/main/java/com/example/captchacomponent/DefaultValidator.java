package com.example.captchacomponent;

public class DefaultValidator implements Validator{

    @Override
    public boolean isValid(String code) {
        return false;
    }
    public String getValidText(){
        return "AAAAA";
    }
    public String getInvalidText(){
        return "BBBBBB";
    }
}