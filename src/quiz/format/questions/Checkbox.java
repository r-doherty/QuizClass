package quiz.format.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public Checkbox(String prompt, int pointValue, ArrayList<Integer> correctAnswers, ArrayList<String> possibleAnswers)
    {
        super(prompt, pointValue);
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
        setPointValue(this.correctAnswers.size());
    }

    public int checkAnswers(ArrayList<Integer> answerKey)
    {
        int answersCorrect = 0;
        for (Integer integer : answerKey) {
            if (correctAnswers.contains(integer)) {
                answersCorrect++;
            }
        }
        return answersCorrect;
    }

    @Override
    public void showAnswers() {
        for(int i = 0; i < possibleAnswers.size(); i++)
        {
            System.out.println(i + " — " + possibleAnswers.get(i));
        }
    }

    @Override

    public int getAnswers() {
        ArrayList<Integer> userAnswers = new ArrayList<>();

        System.out.println("There can be more than one correct answer to this question, to begin answering, please type 'y'.");
        Scanner userPrompt = new Scanner(System.in);
        Scanner userAnswer = new Scanner(System.in);
        String continuePrompt = userPrompt.nextLine();
        while (continuePrompt.indexOf('y') >= 0 && userAnswers.size() <= possibleAnswers.size())
        {
            System.out.println("Enter the corresponding number of the option you believe is correct");

            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            userAnswers.add(option);

            System.out.println("Select additional answers? enter 'y' — to stop, enter 'n'");
            continuePrompt = userPrompt.nextLine();
        }

        return checkAnswers(userAnswers);

    }



}
