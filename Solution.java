/*
    Program which prints the letter M twice.
    The size of the letter depends on the given N by the user

    N can be 2 < N < 10 000 and it MUST be odd number
*/

import java.util.Scanner;

class Solution {
    public static void main(String[] args) 
    {
        // Creates scanner in order to take user's input
        Scanner scanner = new Scanner(System.in);
        // Ask for an input:
        System.out.print("Enter a number N: ");

        try 
        {
            // Takes the input
            int N = scanner.nextInt();
            // Check of the input is valid
            if (N < 2 || N > 10000)
                throw new SolutionException
                                  ("The number should be between 2 and 10000!");
            if (N % 2 != 1)
                throw new SolutionException("The number should be odd!");
                
            // Creates an DoubleM object with the given input
            DoubleM letter = new DoubleM(N);
            // Calls the print method of DoubleM class
            letter.print();
        } // try
        // Print appropriate message if there is an exception
        catch (Exception exception) 
        {
            System.err.println(exception);
        } // catch
        // Close the scanner
        finally
        {
            scanner.close();
        } // finally
    } // main
} // class Solution