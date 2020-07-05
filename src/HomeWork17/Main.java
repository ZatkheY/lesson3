package HomeWork17;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Buy");
        map.put(3, "Bill");
        System.out.println(map.remove(4));
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
