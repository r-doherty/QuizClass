package quiz.format.questions;

public abstract class Question {

    private String prompt;
    private int pointValue;

    public Question (String prompt, int pointValue)  {
        this.prompt = prompt;
        this.pointValue = pointValue;
    }

    public void askQuestion() {
        System.out.println(prompt);
    }

    public int getPointValue() { return this.pointValue; }
    public void setPointValue(int newPointValue) { this.pointValue =  newPointValue; }

    public abstract void showAnswers();

    public abstract int getAnswers();

}
