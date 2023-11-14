package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

public class Question {
    private String type;
    private String description;

    public Question(String type, String description){
        this.type = type;
        this.description = description;
    }

    public String getType(){
        return  type;
    }

    public String getDescription(){
        return  description;
    }

    public void setType(String type){
        this.type = type;
    }
     public void setDescription(String description){
        this.description = description;
     }

}
