package JavaBasics;

public class AnimalSuper {
    public void animal(){
        System.out.println("Animals makes sound");

    }

}
class DogSuper extends AnimalSuper {

 public void animal(){
     super.animal();
     System.out.println("Dog makes sound as Bow");

 }
public void makesound(){
     super.animal();
    System.out.println("cats makes sound as meow");
}
}
class MainSuper{
    public static void main(String [] args){
        DogSuper ds = new DogSuper();
        ds.animal();
      //  ds.makesound();

    }

}