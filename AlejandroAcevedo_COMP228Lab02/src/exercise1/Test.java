package exercise1;

import java.security.SecureRandom;
import java.util.Scanner;

public class Test {
    // Runs 5 questions about Java
    // multiple choice questions with 4 options

    // attributes
    private String[] questions = new String[5];
    private String[][] answers = new String[5][4];
    private int[] correctAnswers = new int[5];
    private String[] correctMessage = { "Excellent!", "Good!",
            "Keep up the good work!", "Nice work!" };
    private String[] wrongMessage = { "No. Please try again",
            "Wrong. Try once more", "Don't give up!", "No. Keep trying.." };
    private String[] randomMessages = {"Welcome to the Java Quiz!", "Oh-oh! Nice day for quizzing, ain't it?", "Hello, adventurer! Let's see how good you are in Java!"};
    SecureRandom random = new SecureRandom();
    int randomInt; // = random.nextInt(4);

    // constructors
    public Test() {
        this.questions[0] = "0 What is a class in Java?";
        this.questions[1] = "1 What is the name of the Java compiler?";
        this.questions[2] = "2 What is inheritance?";
        this.questions[3] = "3 Which ones are access modifiers in Java?";
        this.questions[4] = "4 OOP stands for...";

        this.answers[0][0] = "0.1 a blueprint for creating objects";
        this.answers[0][1] = "0.2 an action";
        this.answers[0][2] = "0.3 a type of variable";
        this.answers[0][3] = "0.4 the compiled file that gets executed by the JVM";
        
        this.answers[1][0] = "1.1 javac";
        this.answers[1][1] = "1.2 java";
        this.answers[1][2] = "1.3 jcompiler";
        this.answers[1][3] = "1.4 jobject";

        this.answers[2][0] = "2.1 When a class can inherit attributes and methods from one class into another";
        this.answers[2][1] = "2.2 When a class can override methods from another class";
        this.answers[2][2] = "2.3 A type of error";
        this.answers[2][3] = "2.4 When a class takes many forms";

        this.answers[3][0] = "3.1 public, default, private, protected";
        this.answers[3][1] = "3.2 final, void, static";
        this.answers[3][2] = "3.3 public, static, volatile";
        this.answers[3][3] = "3.4 public, private, final, interface";

        this.answers[4][0] = "4.1 Object Oriented Programming";
        this.answers[4][1] = "4.2 Object Open Programming";
        this.answers[4][2] = "4.3 Open Object Paradigm";
        this.answers[4][3] = "4.4 Order Object Programming";

        this.correctAnswers[0] = 0;
        this.correctAnswers[1] = 0;
        this.correctAnswers[2] = 0;
        this.correctAnswers[3] = 0;
        this.correctAnswers[4] = 0;
    }

    // getters and setters
    public String getQuestion(int index) {
        return this.questions[index];
    }

    public String[] getAnswers(int qs) {
        return this.answers[qs];
    } 

    // methods
    public int simulateQuestion() {
        // simulates the questions
        randomInt = random.nextInt(4);

        return randomInt;
    }

    public int checkAnswer(int question, int answer) {
        // random message
        randomInt = random.nextInt(4);
        // verifies the answer
        if (answer == correctAnswers[question]) {
            switch (randomInt){
                case 0:
                    System.out.println(correctMessage[0]);
                    break;
                case 1:
                    System.out.println(correctMessage[1]);
                    break;
                case 2:
                    System.out.println(correctMessage[2]);
                    break;
                case 3:
                    System.out.println(correctMessage[3]);
                    break;
            }
            return 1;
        } else {
            // wrong answer
            System.out.println(wrongMessage[randomInt]);
            return 0;
        }
    }

    public void generateMessage(){
        // displays a random msg for the user
        int randomInt = random.nextInt(3);
        System.out.println(randomMessages[randomInt]);
    }

    public int inputAnswer() {
        // interaction with the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer: ");
        if(input.hasNext());
        int alternative = input.nextInt();
        input.close();
        return alternative;
    }
}
