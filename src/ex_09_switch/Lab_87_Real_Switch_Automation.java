package ex_09_switch;

import java.util.Scanner;

public class Lab_87_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

//        String browser  = args[0];
//        System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser){

            case "Chrome":
                System.out.println("Starting the Chrome");
                System.out.println("  ");
                System.out.println("TC1");
                break;

            case "mozila":
                System.out.println("Starting the Mozila");
                break;

            case "Firefox":
                System.out.println("Starting the Firefox");
                break;

            case "edge":
                System.out.println("Starting the Edge");
                break;

            default:
                System.out.println("You don't have any browser");
break;



        }
    }
}
