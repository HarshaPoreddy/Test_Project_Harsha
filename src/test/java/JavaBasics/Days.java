package JavaBasics;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String day = sc.next();

        if (day .equals ("monday")) {
            System.out.println("It's a weekday.");
        } else if (day .equals ("tuesday")) {
            System.out.println("It's a weekday.");
        } else if (day .equals ("wednesday")) {
            System.out.println("It's a weekday.");
        } else if (day .equals ("thursday")) {
            System.out.println("It's a weekday.");
        } else if (day .equals("friday")) {
            System.out.println("It's a weekday.");
        } else if (day .equals ("saturday")) {
            System.out.println("It's a weekend day.");
        } else if (day .equals("sunday")) {
            System.out.println("It's a weekend");
        } else {
            System.out.println("Invalid input. Please enter a valid day of the week.");
        }

    }
}