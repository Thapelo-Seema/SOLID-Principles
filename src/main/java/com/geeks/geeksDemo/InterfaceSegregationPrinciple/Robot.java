package com.geeks.geeksDemo.InterfaceSegregationPrinciple;

public class Robot implements IWorker{
    /*@Override
    public void receiveSalary() {
        //violation
        throw new UnsupportedOperationException("Robot can not receive salary");
    }*/

    @Override
    public void work(){
        System.out.println("Working...");
    }

    /*@Override
    public void takeLunch(){
        //violation
        throw new UnsupportedOperationException("Robot can not take lunch");
    }*/
}
