package JavaBasics;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Harsha");
        al.add("Bharat");
        System.out.println("Printing the array list elements" + al);

        for (String valuesOfArray : al) {
            System.out.println("Printing the array list elements" + al);
        }

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nikitha");
        ll.add("Chandu");

        for(String valuesOfLinkedlist:ll) {
            System.out.println("Printing the linkedlist elements" + ll);
        }

        ll.addAll(1,al);
        System.out.println("Printing the elements" + ll);
        System.out.println(ll.contains("Nikitha"));
       // ll.clear();
        ll.remove("Nikitha");
        System.out.println("Printing the elements" + ll);

        System.out.println(ll.isEmpty());

    }
}
