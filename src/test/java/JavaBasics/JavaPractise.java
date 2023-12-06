package JavaBasics;

public class JavaPractise {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        JavaPractise jw = new JavaPractise();
    }

}

class Pen {
 public void color(){
     System.out.println("White");

 }

    public void behaviour(){
        System.out.println("Writing");

    }

    public static void main(String[] args) {

     String S1 = "HELLO";
     String S2= "123";
        int i = 1;
     float f = 12.12f;
     char c = 'a';
     boolean b = true;
     boolean b1 = false;


     Pen p1 = new Pen();
     p1.behaviour();
     p1.color();
 }

    }
