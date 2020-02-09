package quiz.format;

import java.util.ArrayList;

import quiz.format.questions.Question;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;
    private int total;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for (Question question : questions) {
            this.total = this.total + question.getPointValue();
        }
    }

    public void addQuestion(Question newQuestion)
    {
        this.questions.add(newQuestion);
        this.total = this.total + newQuestion.getPointValue();
    }

    public void updateScore(int x)
    {
        this.score = this.score + x;
    }

    public void runQuiz() {
        for (Question question : questions) {
            question.askQuestion();
            question.showAnswers();
            int pts = question.getAnswers();
            updateScore(pts);
        }
    }

    public void printGrade() {
        System.out.println("Your score is... " + score + " out of " + total);
    }

}
