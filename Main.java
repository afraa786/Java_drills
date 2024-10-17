// File: Main.java

import comparision.Largest; // Importing the Largest class from the comparison package

public class Main {

    public static void main(String[] args)  {
        Largest largest = new Largest(); // Creating an instance of the Largest class

        int number1 = 10; // First number
        int number2 = 20; // Second number

        // Finding and displaying the largest number
        int result = largest.findLargest(number1, number2);
        System.out.println("The largest number between " + number1 + " and " + number2 + " is: " + result);
    }
}

