package com.geeks.geeksDemo.DependencyInversionPrinciple;

public class TranslateRunner {
    public static  void main(String[] args){
        User thapelo = new User("thapelo.seema@geeks4learning.com", "Thapelo");
        LanguageTutorial languageTutorial = new LanguageTutorial(thapelo);
        languageTutorial.translate("Hello World", "Sepedi", "English");
    }
}
