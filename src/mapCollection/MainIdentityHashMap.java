package mapCollection;

import java.util.IdentityHashMap;
import java.util.Map;

public class MainIdentityHashMap {
    public static void main(String[] args) {
        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name + "." + first;

        Map<String , String> map = new IdentityHashMap<>();
        map.put(key1, "Richcy Dian Sukma");
        map.put(key2, "Richcy Dian Sukma");

        System.out.println(map.size());
        System.out.println(key1);
        System.out.println(key2);
    }
}
