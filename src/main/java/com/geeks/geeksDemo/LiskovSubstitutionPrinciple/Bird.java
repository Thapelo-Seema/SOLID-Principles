package com.geeks.geeksDemo.LiskovSubstitutionPrinciple;

public class Bird {

    private int weight;

    //violation LSP
    public void fly(){
        System.out.println("flying...");
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

}
