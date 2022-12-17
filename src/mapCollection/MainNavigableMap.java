package mapCollection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class MainNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Richcy","Richcy");
        map.put("Dian","Dian");
        map.put("Sukma","Sukma");

        System.out.println(map.lowerEntry("Richcy"));
        System.out.println(map.higherEntry("Richcy"));
    }
}
