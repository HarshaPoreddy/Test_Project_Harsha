package JavaBasics;

public class Encapsulation {
    private int Age;
    private String Name;

    public Encapsulation(int Age, String Name) {

        this.Age = Age;
        this.Name = Name;


    }
    public void setAge(int Age) {
        Age = Age;
    }


    public int getAge() {
        return Age;
    }


    public void setName(String Name) {
        Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void display() {
        System.out.println(Age + "" + Name);

    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation(25, "Harsha");
        System.out.println("Person Before Name" + person.getName());
        person.setName("Nikitha");
        System.out.println("Person After Name" + person.getName());
        System.out.println("Person Before Age" + person.getAge());
        person.setAge(27);
        System.out.println("Person After Age" + person.getAge());
        person.display();
    }


}
