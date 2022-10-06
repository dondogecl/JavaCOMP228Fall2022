package exercise2;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;

public class Main {
    public static void main(String[] args) {

        // Ask the user to enter the values for each parameter of the singer object
        JPanel panel = new JPanel(new GridLayout(3, 1));

        JTextField number1  = new JTextField(10);
        JTextField number2  = new JTextField(10);
        JTextField number3  = new JTextField(10);

        // run Lotto 5 times
        for (int i=0; i<5; i++) {
            Lotto lotto = new Lotto();
            int[] lottoNumbers = lotto.getNumbers();

            System.out.println("\nLotto game no " + (i+1));

            for (int j=0; j<lottoNumbers.length; j++) {
                System.out.print(lottoNumbers[j] + " ");
            }
        }
    }
}
