package JavaBasics;

class Mainclass {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class class1 extends Mainclass {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

class class2 extends Mainclass {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

}


public class Methodoverloading3 {
    public static void main(String[] args) {
        Mainclass mc = new Mainclass();
        mc.add(20, 30);
        class1 c = new class1();
        c.add(60, 20);
        class2 c2 = new class2();
        c2.add(15, 30);

    }

}
