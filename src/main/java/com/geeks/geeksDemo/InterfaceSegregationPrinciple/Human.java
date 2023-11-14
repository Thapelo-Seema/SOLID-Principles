package com.geeks.geeksDemo.InterfaceSegregationPrinciple;

public class Human implements IWorker, ILunchTaker, ISalariedWorker{
    @Override
    public void receiveSalary() {
        System.out.println("getting paid");
    }

    @Override
    public void work(){
        System.out.println("Working...");
    }

    @Override
    public void takeLunch(){
        System.out.println("Taking lunch...");
    }
}
