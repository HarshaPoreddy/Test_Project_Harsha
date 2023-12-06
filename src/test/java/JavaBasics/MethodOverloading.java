package JavaBasics;

public class MethodOverloading {

int a,b,c;
    public void add(int a, int b, int c){
        System.out.println(a+b+c);


    }
    public void add(int a ,int b ){
        System.out.println(a+b);
    }

    public static void main(String[] args){

MethodOverloading mo = new MethodOverloading();
       mo.add(10,20,30);

      //  mo.add(10,20);
    }

}
