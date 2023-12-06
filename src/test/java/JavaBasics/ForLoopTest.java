package JavaBasics;

import java.util.Scanner;

public class ForLoopTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
       for (;i<10;i++){
         System.out.println("i value"+i);
         for (int j=0;j<10;j++){
             System.out.println("j value"+j);
         }
       }





      sc.close();
    }
}
