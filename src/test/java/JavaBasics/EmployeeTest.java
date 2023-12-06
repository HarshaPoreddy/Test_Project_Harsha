package JavaBasics;

public class EmployeeTest {

    private static String Companyname = "abc company";
    String Employeename = "";
    int Employeeid;

    public void EmployeeTest(String Employeename, int Employeeid) {
        this.Employeename = Employeename;
        this.Employeeid = Employeeid;
    }

    public static void DisplayEmployeeInfo() {
//        System.out.println(Employeename + "" + Employeeid);
        System.out.println("Hi");
    }

    public void main(String[] args) {


        EmployeeTest et = new EmployeeTest();
        et.EmployeeTest("HARSHA", 11);
//        et.DisplayEmployeeInfo();
        System.out.println(EmployeeTest.Companyname);
        EmployeeTest.DisplayEmployeeInfo();

    }
}


//   class Test{
//
//        public static void main(String[] args){
//
//        EmployeeTest et = new EmployeeTest("Harsha",11);
//        et.DisplayEmployeeInfo();
//
//    }

//}
