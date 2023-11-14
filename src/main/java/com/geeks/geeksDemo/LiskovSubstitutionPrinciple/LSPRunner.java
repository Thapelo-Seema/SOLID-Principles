package com.geeks.geeksDemo.LiskovSubstitutionPrinciple;

public class LSPRunner {
    public static  void main(String[] args){
        Bird bird = new Bird();
        bird.setWeight(15);
        System.out.println(bird.getWeight());
        bird.fly();
        Bird penguin = new Penguin();
        penguin.setWeight(40);
        System.out.println(penguin.getWeight());
        penguin.fly();
        Bird eagle = new Eagle();
        eagle.fly();
        eagle.setWeight(30);
        System.out.println(eagle.getWeight());
    }
}
