package com.geeks.geeksDemo.LiskovSubstitutionPrinciple;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("A penguin can not fly");
    }
}
