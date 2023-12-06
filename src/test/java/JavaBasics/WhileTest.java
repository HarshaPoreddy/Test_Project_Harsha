package JavaBasics;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        int i = sc.nextInt();
        while (i<=10){
            System.out.println("i value"+i);
          i++;

        }
        System.out.println("invalid number");




        sc.close();

    }
}
