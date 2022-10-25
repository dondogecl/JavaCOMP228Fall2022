package exercise3;

import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {
		// create an array of 3 mortgages
		Scanner input = new Scanner(System.in);
		Mortgage[] mortgages = new Mortgage[3];
		double currentInterest;
		double mortgageAmount;
		String mortgageType; // business, personal
		String customer;
		String mortgageTerm;
		
		System.out.println("*********************************");
		System.out.println("Mortgages");
		System.out.println("Simulator");
		System.out.println("*********************************");
		
		System.out.println("Welcome, user. This program will simulate your mortgage, based on the data you provide.\n"
				+ "We will perform 3 evaluations.");
		System.out.println("Please indicate the current interest rate: (example: 1 for 1 percent, 2.5 for 2.5 percent)");
		currentInterest = input.nextDouble();
		input.nextLine();
				
		for (int i = 0; i < mortgages.length; i++) {
			System.out.println("_________________________________");
			System.out.println("Mortgage number is: " + (i + 1));
			System.out.println("Please input the customer name:");
			customer = input.nextLine();
			System.out.println("Please tell us your mortgage Amount:");
			mortgageAmount = input.nextDouble();
			input.nextLine();
			if (mortgageAmount > 300000)
			{
				System.out.println("Sorry, you cannot request a morgage over 300,000 at this time. Try again");
				i = i -1;
				continue;
			}
			System.out.println("Please select a Type of Mortgage. Valid options are: business, personal");
			mortgageType = input.nextLine().toLowerCase();
			System.out.println("Please select a term. Valid options are: short, medium, long");
			mortgageTerm = input.nextLine().toLowerCase();
			
			if (mortgageTerm.equals("short") || mortgageTerm.equals("medium") || mortgageTerm.equals("long")) {
				System.out.println("Term is " + mortgageTerm);
			} else {
				mortgageTerm = "short";
			}
			
			// debug
			//System.out.println(i + customer + mortgageAmount + mortgageType + mortgageTerm + currentInterest);
			
			// creates the simulation
			if (mortgageType.equals("business")) {
				mortgages[i] = new BusinessMortgage(i+1, customer, currentInterest, mortgageAmount, mortgageTerm);
			} else if (mortgageType.equals("personal")) {
				mortgages[i] = new PersonalMortgage(i+1, customer, currentInterest, mortgageAmount, mortgageTerm);
			} else {
				System.out.println("*Please use a valid type like Business or Personal*");
				i = i - 1;
				continue;
			}
			
		}
		
		// Display all the simulations
		int duration;
		System.out.println("\n_______________________________");
		
		for (int j = 0; j < mortgages.length; j++) {
			if (mortgages[j].term.equals("long")) {
				duration = MortgageConstants.longTerm;
			} else if (mortgages[j].term.equals("medium")) {
				duration = MortgageConstants.mediumTerm;
			} else {
				duration = MortgageConstants.shortTerm;
			}
			
			double percentage = mortgages[j].interestRate + 1.0;
			//System.out.println(percentage);
			System.out.println("* Bank : " + MortgageConstants.bankName + " *");
			System.out.println("Simulation #" + mortgages[j].mortgageNumber + " for Customer " + mortgages[j].customerName);
			System.out.println("Amount of mortgage requested: " + mortgages[j].mortgageAmount);
			System.out.println("Term: " + mortgages[j].term + " which lasts " + duration + " years.");
			System.out.println("Amount to pay: " + mortgages[j].mortgageAmount * percentage);
			System.out.println("Interest rate: " + mortgages[j].interestRate + "%");
			System.out.println("_____________________________________");
		}
		
		System.out.println("\n***\nThanks for using our Mortgage Simulator tool, have a nice day.\n***");
	input.close();
	}

}
