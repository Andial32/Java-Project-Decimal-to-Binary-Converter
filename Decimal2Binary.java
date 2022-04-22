package com.company;
// Import the neccessary java utilities required for the application
import java.util.Scanner;
import java.util.Stack;

class Decimal2Binary
{
    public static void main(String[] arg)
    {
        // Sets the scanner to take user input
        Scanner sc= new Scanner(System.in);
        // Creates an empty Stack that the Integer class wraps a value of the primitive type int in that object
        Stack<Integer> s= new Stack<Integer>();
        System.out.println("Enter decimal number: ");
        // Integer value is obtained by user input
        int n = sc.nextInt();
        // If the int value is different from 0 the code divides the number by 2 until the quotient is 0
        while(n != 0)
        {
            int d = n % 2;
            // "Push" pushes the next number in top in order to keep divding by 2
            s.push(d);
            n /= 2;
        }
        System.out.print("Binary equivalent is : ");
        // Checks wether there are more numbers to be put into function
        while (!(s.isEmpty() ))
        {
            // Removes the object from the top of the stack and returns it as the final value of the function
            System.out.print(s.pop());
        }
    }
}