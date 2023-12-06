package JavaBasics;

import java.util.Scanner;

public class WhileTest2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int i = sc.nextInt();
            i = 50;
            while (i<=60){
                System.out.println("i value"+i);
                i++;
            }

            sc.close();
        }
    }

