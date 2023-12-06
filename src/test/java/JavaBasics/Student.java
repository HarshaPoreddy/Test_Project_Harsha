package JavaBasics;

public class Student {
    private String name;
    int id;
    String course;
    public Student(String name,int id){
this.name = name;
this.id = id;

        System.out.println(name+" "+id);

    }
  public static void main(String[] args){
        Student s = new Student("Harsha",11);


  }

}
