package JavaBasics;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        do {
            System.out.println("i value" + i);
          i++;
        }
        while (i <= 10);
//        i++;

        sc.close();


    }
}
