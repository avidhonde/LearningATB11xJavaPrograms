package ex_09_switch;

import java.util.Scanner;

public class Lab_086_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
            break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
