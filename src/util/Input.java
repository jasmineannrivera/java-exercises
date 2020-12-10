package util;

import java.util.Scanner;

public class Input {

    //private property named scanner
    private Scanner scanner;

    //When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input() {
        this.scanner = new Scanner(System.in);
    }
    //The class should have the following methods, all of which return command line input from the user:

    public void clear() {
        this.scanner.nextLine();
    }

    //method to prompt user for string then return their input
    public String getString() {
        System.out.println("Input string: ");
        return this.scanner.nextLine();
    }

    //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.


    public boolean yesNo() {
        System.out.println("Yes or No?");
        //grab the user's response by using getString method
        String input = getString();
        //validate input to return boolean
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }

    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.


    public int getInt(int min, int max) {
        //define an input, parsed input, and starting boolean
        String input;
        int parsedInput;
        boolean inputIncorrect = false;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextLine();

                parsedInput = Integer.parseInt(input);
                if (parsedInput < min || parsedInput > max) {
                    System.out.println("Input invalid");
                    inputIncorrect = true;
                } else {
                    // user entered a correct integer
                    inputIncorrect = false;
                }
        } while (inputIncorrect);
        System.out.println("Input acceptable");
        return parsedInput;
    }

    public int getInt() {
        System.out.println("Input number:");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = 0.0;
        boolean incorrectInput = false;
        do {
            incorrectInput = false;
            System.out.println("Enter a number between " + min + " and " + max + ".");

            if (input < min || input > max) {
                System.out.println("Input invalid");
                System.out.println();
                incorrectInput = true;
            }
        } while (incorrectInput || input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public double getDouble() {
        System.out.println("Input number:");
        return this.scanner.nextDouble();
    }
}
