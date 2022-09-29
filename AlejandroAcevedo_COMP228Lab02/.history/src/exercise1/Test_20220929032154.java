package exercise1;

import java.security.SecureRandom;

public class Test {
    // Runs 5 questions about Java
    // multiple choice questions with 4 options

    // attributes
    private String[] questions = new String[5];
    private String[][] answers = new String[5][4];
    private int[] correctAnswers = new int[5];
    private String[] correct_message = { "Excellent!", "Good!",
            "Keep up the good work!", "Nice work!" };
    private String[] wrong_message = { "No. Please try again",
            "Wrong. Try once more", "Don't give up!", "No. Keep trying.." };
    SecureRandom random = new SecureRandom();
    int randomInt; // = random.nextInt(4);

    // constructors
    public Test() {
        this.questions[0] = "0 What is the name of the Java compiler?";
        this.questions[1] = "1 What is the name of the Java compiler?";
        this.questions[2] = "2 What is the name of the Java compiler?";
        this.questions[3] = "3 What is the name of the Java compiler?";
        this.questions[4] = "4 What is the name of the Java compiler?";

        this.answers[0][0] = "0.1 javac";
        this.answers[0][1] = "0.2 java";
        this.answers[0][2] = "0.3 javac.exe";
        this.answers[0][3] = "0.4 java.exe";
        
        this.answers[1][0] = "1.1 javac";
        this.answers[1][1] = "1.2 java";
        this.answers[1][2] = "1.3 javac.exe";
        this.answers[1][3] = "1.4 java.exe";

        this.answers[2][0] = "2.1 javac";
        this.answers[2][1] = "2.2 java";
        this.answers[2][2] = "2.3 javac.exe";
        this.answers[2][3] = "2.4 java.exe";

        this.answers[3][0] = "3.1 javac";
        this.answers[3][1] = "3.2 java";
        this.answers[3][2] = "3.3 javac.exe";
        this.answers[3][3] = "3.4 java.exe";

        this.answers[4][0] = "4.1 javac";
        this.answers[4][1] = "4.2 java";
        this.answers[4][2] = "4.3 javac.exe";
        this.answers[4][3] = "4.4 java.exe";

        this.correctAnswers[0] = 2;
        this.correctAnswers[1] = 2;
        this.correctAnswers[2] = 2;
        this.correctAnswers[3] = 2;
        this.correctAnswers[4] = 2;
    }

    // getters and setters
    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    // methods
    public int simulateQuestion() {
        // simulates the questions
        randomInt = random.nextInt(4);
        return randomInt;
    }

    public int checkAnswer(int answer) {
        // verifies the answer
        if (answer == correctAnswers[randomInt]) {
            return 1;
        } else {
            return 0;
        }
    }

    public void generateMessage(){
        // displays a random msg for the user
    }

    public void inputAnswer() {
        // interaction with the user
    }
}
