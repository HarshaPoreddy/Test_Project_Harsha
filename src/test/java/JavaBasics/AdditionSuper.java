package JavaBasics;

public class AdditionSuper {

    public void add(int a, int b) {
        System.out.println(a + b);
    }


}

class substraction extends AdditionSuper {
    public void add(int a, int b) {
        super.add(10,20);
        System.out.println(a - b);
    }

    public void addition(int a, int b) {
        super.add(10,10);
        System.out.println(a * b);
    }

}


class MainSuperclass{
    public static void main(String[] args){
        substraction s = new substraction();
        s.add(5,10);
                s.addition(2,3);
                }
                }