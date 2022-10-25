package exercise2;

import java.util.Scanner;

public class TestGameTester {

	static int hours;
	static String role;

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// welcome message
    	System.out.println("Welcome to the Game Testers income calculator.\n");
    	
    	System.out.println("We have two Game Tester positions available.\n"
    			+ "Please input one of the following options:\n"
    			+ "full-time\n"
    			+ "part-time");
    	System.out.println("______________________________");
    	
    	role = input.nextLine();
    	
    	switch (role) {
    	case "full-time":
    	case "fulltime":
    		GameTester tester = new FullTimeGameTester();
    		System.out.println("The position Full-time game tester\n"
    				+ "has a base salary of: $" + tester.getSalary());
    		break;
    	case "part-time":
    	case "parttime":
    		GameTester tester1 = new PartTimeGameTester();
    		System.out.println("Please indicate the number of weekly hours for your position:");
    		hours = input.nextInt();
    		((PartTimeGameTester) tester1).setHours(hours);
    		System.out.println("The position Part-time game tester\n"
    				+ "has an hourly rate of $20 per hour\n"
    				+ "You entered " + hours + "\n"
    				+ "The monthly salary will be of: $" + tester1.getSalary());
    		break;
    	}
    	
		// closes stream
		input.close();
	}

}
