package com.geeks.geeksDemo.DependencyInversionPrinciple;

public class GoogleTranslatorAdapter implements ILanguageTranslator{

    GoogleTranslateAPI googleTranslateAPI;
    public GoogleTranslatorAdapter(User user){
        this.googleTranslateAPI = new GoogleTranslateAPI(user);
    }
    @Override
    public String translate(String text, String from, String to){
        return googleTranslateAPI.translate(text, from, to);
    }
}
