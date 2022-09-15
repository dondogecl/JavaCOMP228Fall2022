package account;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AccountDriver {
    public static void main(String[] args) {
        System.out.println("test");

        // create an account object with the name Centennial and the amount 10,000
        Account account1 = new Account("Centennial", -10000);
        
        // print the account object
        System.out.println("The account called " + account1.getName() + " has a balance of: $" + account1.getBalance());

        // Create a new account using the Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the primitive bank System. Please enter the new client account name:");
        String name = input.nextLine();
        System.out.println("Now, enter your first balance amount:");
        double balance = input.nextDouble();
        Account client1 = new Account(name, balance);
        // Display the results:
        System.out.println("New Account created \nAccount Name: " + client1.getName() + "\nInitial balance: $" + client1.getBalance());

        // Create new account using the Swing dialog box
        name = JOptionPane.showInputDialog(null, "Hello, bank teller. Please enter the name of the new account:");
        Account account2 = new Account(name);
        String windowMessage = "New account created. Details:\nAccount Name: " + account2.getName() + "\nInitial Balance: $" + account2.getBalance();
        JOptionPane.showMessageDialog(null, windowMessage);
        
        // closes the scanner stream
        input.close();

        
    }
    
}
