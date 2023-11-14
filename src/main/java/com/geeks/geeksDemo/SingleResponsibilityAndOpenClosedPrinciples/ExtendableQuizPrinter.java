package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

import java.util.List;

public class ExtendableQuizPrinter {
    //Single responsibility to print a quiz
    public void printQuizViaConsole(List<IQuestion> questions){
        for (IQuestion q: questions) {
            //runtime polymorphism
            System.out.println(q.printQuestion());
        }
    }

    //printJsonQuiz
    //printHTMLQuiz
}
