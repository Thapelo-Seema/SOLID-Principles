package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

public class MultipleChoice extends Question implements IQuestion {
    public MultipleChoice(String type, String description) {
        super(type, description);
    }

    @Override
    public String printQuestion() {
        return "a) Blue \n b) Red ";
    }
}
