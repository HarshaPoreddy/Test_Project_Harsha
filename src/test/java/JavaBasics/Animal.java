package JavaBasics; // Method Overriding example

public class Animal {

        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

class Cat extends Animal{
    void makeSound() {
        System.out.println("Cat makes a meow");
    }

}

class Dog extends Animal{
    void makeSound() {
        System.out.println("Dog makes a Bow");
    }

}

class Main{
    public static void main(String[] args){

       Animal a = new Cat();
       a.makeSound();

    }


}
