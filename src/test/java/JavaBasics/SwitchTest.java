package JavaBasics;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day");
        String day = sc.next();
        switch (day){
            case "Sunday":
            case "Saturday":
                System.out.println("ITS A WEEKEND");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("ITS A WEEKday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }




        sc.close();
    }
}
