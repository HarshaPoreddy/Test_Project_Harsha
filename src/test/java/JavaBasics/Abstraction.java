package JavaBasics;


abstract class AnimalAbstraction {

    public abstract void makeSound();


    public void sleep() {
        System.out.println("Animals sleeping");
    }
}

class Dog1 extends AnimalAbstraction{
    @Override
    public void makeSound() {
        System.out.println("Dogs makes sound as Bow");

    }
}

class Cat1 extends AnimalAbstraction{


    @Override
    public void makeSound() {
        System.out.println("cats makes sound as meow");
    }
}
class Main1{
    public static void main(String[] args){

        AnimalAbstraction ab = new Cat1();
        ab.makeSound();
        AnimalAbstraction ab1 = new Dog1();
        ab1.makeSound();
    }

}