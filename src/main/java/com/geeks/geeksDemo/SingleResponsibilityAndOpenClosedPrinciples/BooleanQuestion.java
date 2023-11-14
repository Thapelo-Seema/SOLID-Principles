package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

public class BooleanQuestion extends Question implements IQuestion {
    public BooleanQuestion(String type, String description){
        super(type, description);
    }

    public String printQuestion(){
        String question = this.getDescription() + "\n";
        question += "1.True\n2.False";
        return question;
    }
}
