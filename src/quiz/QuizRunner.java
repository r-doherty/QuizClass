package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import quiz.format.Quiz;
import quiz.format.questions.Checkbox;
import quiz.format.questions.TrueFalse;
import quiz.format.questions.MultipleChoice;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());

        ArrayList<String> questionOneOptions = new ArrayList<>(Arrays.asList("Phillip Rivers", "Patrick Mahomes", "Peyton Manning", "Dan Marino"));
        ArrayList<Integer> questionOneAnswer = new ArrayList<>(Arrays.asList(1, 2));
        Checkbox questionOne = new Checkbox("Of the options listed, which NFL quarterbacks have won a Super Bowl?", 2, questionOneAnswer, questionOneOptions);
        myQuiz.addQuestion(questionOne);

        ArrayList<String> questionTwoOptions = new ArrayList<>(Arrays.asList("Austin City Limits", "Lollapalooza", "Coachella", "South By Southwest", "EDC"));
        MultipleChoice questionTwo = new MultipleChoice("What is the name of the famous Austin, TX based Music, Tech, and Film conference which started in 1987?", 1,3, questionTwoOptions);
        myQuiz.addQuestion(questionTwo);

        TrueFalse questionThree = new TrueFalse("Dogs rule, and cats drool...", 1, true);
        myQuiz.addQuestion(questionThree);

        myQuiz.runQuiz();

        myQuiz.printGrade();
    }
}
