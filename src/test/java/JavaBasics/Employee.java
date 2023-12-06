package JavaBasics;

public class Employee {
    int Empid;
    String Empname;
    float Empsalary;

    public void display(int Empid, String Empname, float Empsalary) {
        this.Empid = Empid;
        this.Empname = Empname;
        this.Empsalary = Empsalary;
        System.out.println(Empid + "" + Empname + "" + Empsalary);
    }
}
        class Test1{
            public static void main(String[] args){
                Employee e = new Employee();
                e.display(1,"Harsha",10000f);
                e.display(2,"Nikitha",20000f);
                e.display(3,"sravan",30000f);

            }
        }





