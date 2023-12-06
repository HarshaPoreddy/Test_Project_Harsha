package JavaBasics;

public class Polymorphism {

    int a ;
    int b;
    int c;
    public void add(int a ,int b){

       this.a = a;
       this.b = b;
        c = a+b;
    }

    public void add(int a ,int b , int z){

        this.a = a;
        this.b = b;
        c = a+b;
    }

    public static void main(String[] args){

        Polymorphism p = new Polymorphism();
        System.out.println(p.c);

    }

}
