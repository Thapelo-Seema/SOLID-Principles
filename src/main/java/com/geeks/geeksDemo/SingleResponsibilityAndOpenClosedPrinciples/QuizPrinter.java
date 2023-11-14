package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

import java.util.ArrayList;
import java.util.List;

public class QuizPrinter {

    public  void printQuiz(List<Question> questionList){
        for (Question q: questionList) {
            System.out.println(q.getDescription());
            switch (q.getType()){
                case "boolean":
                    System.out.println("1. True \n2. False");
                    break;
                case "text":
                    System.out.println("Answer___________________");
                    break;
                /*case "range":
                    System.out.println("Min____\nMax____");
                    break;*/
                /*case "range":
                    System.out.println("Min____\nMax____");
                    break;*/
            }
        }
    }




    //violates single responsility
    public Question generateRandomQuestion(int input){
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("text", "What is your name"));
        questions.add(new Question("boolean", "What is your name"));
        questions.add(new Question("range", "What is your name"));

       return questions.get(input % questions.size());
    }

}
