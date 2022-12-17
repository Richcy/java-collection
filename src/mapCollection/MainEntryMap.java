package mapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainEntryMap {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("Richcy", "Richcy");
        map.put("Dian", "Dian");
        map.put("Sukma", "Sukma");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println("====");
            System.out.println("Key: "+ entry.getKey());
            System.out.println("Value: "+ entry.getValue());
        }
    }
}
