package exercise1;

public class Main {
    public static void main(String[] args) {
        int correctAnswers = 0;
        int numberOfQuestions = 5;

        Test test = new Test();
        
        // execution
        test.generateMessage();

        for (int i = 0; i < numberOfQuestions; i++) {
            // simulates the question
            System.out.println(test.getQuestion(i));
            // shows all possible answers
            for (int j = 0; j < test.getAnswers(i).length; j++) {
                System.out.println(test.getAnswers(i)[j]);
            }

            // ask for answer
            int answer = test.inputAnswer();

            test.checkAnswer(i, answer);

        }
        
        System.out.println("You got " + correctAnswers + " correct answers!");
      
    }
}
