package mapCollection;

import java.util.Map;
import java.util.WeakHashMap;

public class MainWeakHashMap {
    public static void main(String[] args) {
        System.out.println("Weak Hash Map");
        Map<Integer, Integer> map1 = new WeakHashMap<>();
        for (int i = 0; i < 100000; i++){
            map1.put(i, i);
        }
        System.gc();
        System.out.println(map1.size());
    }
}
