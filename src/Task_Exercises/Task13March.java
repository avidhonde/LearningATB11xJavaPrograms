package Task_Exercises;

import java.util.Scanner;

public class Task13March {
//    terneri operator using Nasted Ternary(similar to IF ELSE Statement)
public static void main(String[] args) {
   /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
     A: 90-100
     B: 80-89
     C: 70-79
     D: 60-69
     F: 0-59 */
    int marks = Integer.parseInt(args[0]);

    String result =(marks<=59)?"F":((marks<=69)?"D":(marks<=79)?"C":(marks<=89)?"B":(marks<=100)?"A":"Invalid Marks");
    System.out.println(result);

//
//    Input value = 87;
//    output = b;

}
}
