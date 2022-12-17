package legacyCollection;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MainHashTable {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("Richcy", "Richcy");
        map.put("Dian", "Dian");
        map.put("Sukma", "Sukma");

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}
