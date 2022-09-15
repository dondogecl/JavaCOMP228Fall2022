package exercise1;
import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args){
        // Auto generated method stub
        String name = JOptionPane.showInputDialog("Please, tell me your name: ");
        String message = "Welcome " + name + " to COMP 228!";
        JOptionPane.showMessageDialog(null, message);
    }
}
