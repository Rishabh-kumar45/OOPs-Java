import java.util.HashMap;
import java.util.Map;

public class clgLab6_32 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        int size = map.size();

        System.out.println("Map: " + map);
        System.out.println("Number of key-value mappings: " + size);
    }
}