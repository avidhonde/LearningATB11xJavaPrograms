package ex_11_while;

import java.util.Scanner;

public class Lab_121_While_IQ {
    public static void main(String[] args) {
//        factorial program using while ex.5;
//          5*4*3*2*1 = 120
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("enter the factorial"); // Prompt the user for input
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // Initialize the factorial variable to 1
        if (number<=0){ // Check if the number is less than or equal to 0
            System.out.println(factorial); // If true, print the factorial (which is 1)
        }else{             // If the number is greater than 0, calculate the factorial
            for (int i=1;i<=number;i++){ // Loop from 1 to the number
                factorial =factorial*i; // Multiply the current factorial value by i
            }
            System.out.println("facatorial:" +factorial); // Print the calculated factorial
        }
    }
}
