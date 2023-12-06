package JavaBasics;

import java.security.PublicKey;

public class MethodOverloading2 {

    public void empinfo(String Name , int Id){
        System.out.println(Name);
        System.out.println(Id);
    }

    public void empinfo(int Id , String Name){
        System.out.println(Id);
        System.out.println(Name);
    }

    public static void main(String[] args){
        MethodOverloading2 mo = new MethodOverloading2();
      mo.empinfo("Harsha",11);
       // mo.empinfo(15,"Nikitha");


    }

}
