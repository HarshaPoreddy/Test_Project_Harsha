package JavaBasics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args){
       //Set<String> s = new HashSet<>();
        Set<String> s = new LinkedHashSet<>();
     //   Set<String> s = new TreeSet<>();
        s.add("Harsha");
        s.add("Bharath");
        s.add("Nikitha");
        s.add("Chandu");
        s.add("Harsha");
        System.out.println("Printing set elements"+s);

        for (String test: s)
        {
            System.out.println("Printing set elements" +test);
        }
    }
}
