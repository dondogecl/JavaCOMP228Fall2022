package exercise1;

public class Test {
    // Runs 5 questions about Java
    // multiple choice questions with 4 options

    // attributes
    private String[] questions = new String[5];
    private String[] correct_message = {"Excellent!","Good!",
                                        "Keep up the good work!", "Nice work!"};
    private String[] wrong_message = {"No. Please try again", 
                                        "Wrong. Try once more", "Don't give up!","No. Keep trying.."};

    // constructors
    public Test(){
        this.questions[0] = "0 What is the name of the Java compiler?";
        this.questions[1] = "1 What is the name of the Java compiler?";
        this.questions[2] = "2 What is the name of the Java compiler?";
        this.questions[3] = "3 What is the name of the Java compiler?";
        this.questions[4] = "4 What is the name of the Java compiler?";
    }

    // getters and setters
    public String[] getQuestions() {
        return questions;
    }
    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    // methods
    public void simulateQuestion(){
        // simulates the questions
    }
    public void checkAnswer(){
        // verifies the answer
    }
    public void generateMessage(){\
        // displays a random msg for the user
    }
    public void inputAnswer(){
        // interaction with the user
    }
}
