package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

public class TextQuestion extends Question implements IQuestion {

    //inheriting properties from super class
    public TextQuestion(String type, String description) {
        super(type, description);
    }

    //implementing an interface
    public String printQuestion(){
        String question = this.getDescription() + "\n";
        question += "Answer:_____________________________";
        return  question;
    }
}
