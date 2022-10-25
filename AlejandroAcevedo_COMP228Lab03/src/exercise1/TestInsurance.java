package exercise1;

import java.util.Scanner;

public class TestInsurance {
    public static void main(String[] args) {
        /**
         * Student: I. Alejandro Acevedo
         * ID: 301222234
         * Class: Comp 228
         */
    	
    	Scanner input = new Scanner(System.in);
        String insuranceType;
        double monthlyFee;
        int numberOfPolicies;
            	
    	// asking user to indicate which insurance they want
    	System.out.println("Welcome to the registry of Insurance Policies. Please select the number of policies that will be stored:");
        numberOfPolicies = input.nextInt();
    	input.nextLine();
    	// creating array and declaring the length from the user input
    	Insurance[] insurancesArray = new Insurance[numberOfPolicies];
    	
    	for (int i=0; i < numberOfPolicies; i++) {
    		System.out.println("Please select a type of insurance. Type one of the following options:");
            System.out.println("Health\nLife");
            insuranceType = input.nextLine().toLowerCase();
            System.out.println("Please enter your monthly fee:");
            monthlyFee = input.nextDouble();
            input.nextLine();
            
            // create instance according to the answer
            switch (insuranceType) {
            case "life":
            	insurancesArray[i] = new Life();
            	insurancesArray[i].setInsuranceCost(monthlyFee);
                break;
            case "health":
            	insurancesArray[i] = new Health();
            	insurancesArray[i].setInsuranceCost(monthlyFee);
            	break;
            }      
    	}
    	
        // display the insurances created
    	System.out.println("*****************************************************");
    	System.out.println("You have a total of " + insurancesArray.length + " insurance policies. Details follow:");
    	
    	for (int j=0; j < insurancesArray.length; j++) {
        	insurancesArray[j].displayInfo();
        	System.out.println("_______________________________________");
    	}
    	

        // end stream
        input.close();
    }
}
