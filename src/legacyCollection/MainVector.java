package legacyCollection;

import java.util.List;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        List<String> names = new Vector<>();
        names.add("Richcy");
        names.add("Dian");
        names.add("Sukma");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
