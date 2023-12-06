package JavaBasics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapTest {
    public static void main(String[] args){
      //  Map<String,Integer> map = new HashMap<>();
       // Map<String,Integer> map = new LinkedHashMap<>();
        Map<String,Integer> map = new TreeMap<>();
        map.put("Harsha",26);
        map.put("Bharath",32);
        map.put("Chandu",30);
        map.put("Nikitha",27);
        System.out.println("printing elements" + map);
        int age = map.get("Harsha");
        System.out.println(age);
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}
