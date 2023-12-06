import java.util.Scanner;

public class NestedifTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Subject: ");
        String Subject = sc.next();

        if (Subject .equals ("Python")) {
            System.out.println("This subject is from CSE branch.");
        } else if (Subject .equals ("Java") ){
            System.out.println("This subject is from CSE branch.");
        } else if (Subject .equals ("Java Script") ){
            System.out.println("This subject is from CSE branch.");
        } else if (Subject .equals ("Electronics") ){
            System.out.println("This subject is from ECE branch.");
        } else if (Subject .equals ("Networking") ){
            System.out.println("This subject is from ECE branch.");
        } else if (Subject .equals ("Probability") ){
            System.out.println("This subject is from ECE branch.");
        } else if (Subject .equals ("ETP") ){
            System.out.println("This subject is from Civil branch.");
        } else if (Subject .equals ("Drawings") ){
            System.out.println("This subject is from Civil branch.");
        } else if (Subject .equals ("Schema") ){
            System.out.println("This subject is from Civil branch.");

        } else {
            System.out.println("Invalid input. Please enter a valid Subject.");
        }

    }
}
