package quiz.format.questions;

import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean correctAnswer;

    public TrueFalse(String prompt, int pointValue, boolean correctAnswer) {

        super(prompt, pointValue);
        setPointValue(1);
        this.correctAnswer = correctAnswer;

    }

    public boolean checkAnswer(boolean userResponse)
    {
        return userResponse == correctAnswer;
    }

    @Override
    public void showAnswers(){
        System.out.println("True...? or False...?");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Type 't' for true, and 'f' for false! Choose wisely");
        String userAnswer = answer.nextLine();

        if(userAnswer.indexOf('t') >= 0) {
            if(checkAnswer(true))
                return 1;
            else
                return 0;
        }
        else {
            if (checkAnswer(false))
                return 1;
            else
                return 0;
        }

    }

}
