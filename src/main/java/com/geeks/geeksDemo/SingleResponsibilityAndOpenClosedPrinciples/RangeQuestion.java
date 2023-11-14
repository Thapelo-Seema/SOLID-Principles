package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

public class RangeQuestion extends Question implements IQuestion {
    public RangeQuestion(String type, String description){
        super(type, description);
    }

    public String printQuestion(){
        String question = this.getDescription() +"\n";
        question += "Min:\nMax:";
        return question;
    }
}
