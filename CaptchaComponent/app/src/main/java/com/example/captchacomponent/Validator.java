package com.example.captchacomponent;

public interface Validator {
    public boolean isValid(String input);
    public String getValidText();
    public String getInvalidText();
}