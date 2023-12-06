package JavaBasics;

import java.util.Scanner;

public class DoWhileTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int i = sc.nextInt();
        do {
            System.out.println("i value" + i);
            i++;
        }
        while (i <= 60);

        sc.close();


    }
}
