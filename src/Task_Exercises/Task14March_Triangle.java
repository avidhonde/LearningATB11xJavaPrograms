package Task_Exercises;

import java.util.Scanner;

public class Task14March_Triangle {
    public static void main(String[] args) {
//Triangle clasifier

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter side2");
        int side2 = sc.nextInt();
        System.out.println("Enter side3");
        int side3 = sc.nextInt();

        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("this is not triangle");
            System.exit(0);
        }
        if (side1+side2<=side3||side2+side3<=side1||side1+side3<=side2){
            System.out.println("this is not triangle");
            System.exit(0);
        }
        if (side1==side2 && side2== side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1==side2 ||side2==side3||side3==side1) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("scalene");
        }



    }
}
