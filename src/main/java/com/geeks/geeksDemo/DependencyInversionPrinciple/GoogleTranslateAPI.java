package com.geeks.geeksDemo.DependencyInversionPrinciple;

public class GoogleTranslateAPI {
    User user;
    public GoogleTranslateAPI(User user){
        this.user = user;
    }
    public String translate(String text, String from, String to){
        return  "Hi " + user.getName() + " , here is your Google tranlsated text: " + text;
    }
}
