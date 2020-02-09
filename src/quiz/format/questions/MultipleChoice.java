package quiz.format.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(String prompt, int pointValue, int correctAnswer, ArrayList<String> possibleAnswers)
    {
        super(prompt, pointValue);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void showAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++)
        {
            System.out.println(i + " — " + possibleAnswers.get(i));
        }
    }

    public boolean checkAnswers(int userResponse){
        return userResponse == correctAnswer;
    }

    @Override
    public int getAnswers() {
        System.out.println("Enter the corresponding number of the option you believe is correct");

        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);

        if(checkAnswers(result)){
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
