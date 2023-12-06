package JavaBasics;

import java.util.Scanner;

public class SwitchTest2 {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a Subject");
            String Subject = sc.next();
            switch (Subject){
                case "Python":
                case "Java":
                case "Java Script":
                    System.out.println("These subjects are from CSE branch");
                    break;
                case "Electronics":
                case "Networking":
                case "Probability":
                    System.out.println("These subjects are from ECE branch");
                    break;
                case "ETP":
                case "Drawings":
                case "Schema":
                    System.out.println("These subjects are from Civil branch");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }




            sc.close();
        }
    }


