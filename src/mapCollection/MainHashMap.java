package mapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MainHashMap {
    public static void main(String[] args) {
        System.out.println("Hash map");
        Map<String , String> map = new HashMap<>();
        map.put("firstName", "Richcy");
        map.put("middleName", "Dian");
        map.put("lastName", "Sukma");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("middleName"));
        System.out.println(map.get("lastName"));
    }
}
