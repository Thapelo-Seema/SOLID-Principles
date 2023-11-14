package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

public class OneTermQuestion  extends Question implements IQuestion {

    public OneTermQuestion(String type, String description) {
        super(type, description);
    }
    @Override
    public String printQuestion() {
        return "Term--------One:Answer";
    }
}
