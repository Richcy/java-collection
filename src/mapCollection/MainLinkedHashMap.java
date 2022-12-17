package mapCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Richcy", "Richcy");
        map.put("Dian", "Dian");
        map.put("Sukma", "Sukma");

        for (var key : map.keySet()){
            System.out.println(key);
        }
    }
}
