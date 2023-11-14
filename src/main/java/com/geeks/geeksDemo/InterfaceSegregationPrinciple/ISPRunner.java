package com.geeks.geeksDemo.InterfaceSegregationPrinciple;

public class ISPRunner {
    public static void main(String[] args){
        Human human = new Human();
        Robot robot = new Robot();
        human.receiveSalary();
        human.work();
        human.takeLunch();

        System.out.println("----------------------------------------------------\n\n");

        //robot.receiveSalary(); //method should not be available for use if it is meaningless
        robot.work();
        //robot.takeLunch(); //method should not be available for use if it is meaningless
                             //Its just using up computing resources without providing any value
    }
}
