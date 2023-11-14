package com.geeks.geeksDemo.SingleResponsibilityAndOpenClosedPrinciples;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {

    public static void main(String[] args){
        List<Question> questions = new ArrayList<>();
        questions.add( new Question("boolean", "You are smart"));
        questions.add( new Question("text", "What does SOLID stand for?"));
        questions.add( new Question("boolean", "You are ready to go out and build cool sh**t"));
       // questions.add( new Question("range", "What is your salary expectation?"));

        QuizPrinter quizPrinter = new QuizPrinter();
        quizPrinter.printQuiz(questions);

        System.out.println("---------------------------------------------------------------------------\n");

        //-------------------------------------------------------------------------
        List<IQuestion> iQuestions = new ArrayList<>();
        iQuestions.add( new BooleanQuestion("boolean", "You are smart"));
        iQuestions.add( new TextQuestion("text", "What does SOLID stand for?"));
        iQuestions.add( new BooleanQuestion("boolean", "You are ready to go out and build cool sh**t"));
        iQuestions.add( new MultipleChoice("multiple choice", "You are ready to go out and build cool sh**t"));
        iQuestions.add(new OneTermQuestion("one tterm", "what you age?"));

        ExtendableQuizPrinter extendableQuizPrinter = new ExtendableQuizPrinter();
        extendableQuizPrinter.printQuizViaConsole(iQuestions);
        //WordCount


    }
}
