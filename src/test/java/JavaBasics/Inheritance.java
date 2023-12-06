package JavaBasics;

public class Inheritance {

    public void test() {
        System.out.println("In method 1 from Class 1");
    }

    public void test2() {
        System.out.println("In method 3 from Class 2");
    }
}
 class InheritanceTest extends Inheritance {

     public void test() {
         System.out.println("In method 2 from Class 2");
     }

     public void test2() {
         System.out.println("In method 3 from Class 2");

     }

     public void test3(){
         System.out.println("In method 4 from Class 2");

     }
 }

     class MainInheritance {
         public static void main(String[] args) {

             InheritanceTest secondClassObject = new InheritanceTest();
             secondClassObject.test();
             Inheritance firstClassObject = new Inheritance();
             firstClassObject.test();
             Inheritance firstClassObject1 = new InheritanceTest();
secondClassObject.test2();

         }

     }
