import java.util.Scanner;

class Week2{
    /*
     * Author:
     * Date:
     * Description:
     * Input:
     * Output:
     */
    public static void main(String[] args) {
        // libraries and imports
        
        
        // take input from the user (String type)
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");

        // take numerical input from the user (int type) and sum two numbers
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        // display result
        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        System.out.printf(format, args)

        input.close();

    }
}