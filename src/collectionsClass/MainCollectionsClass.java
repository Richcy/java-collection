package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCollectionsClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Richcy","Dian","Sukma","Mantaps","Wkwkwk"));
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);
    }
}
