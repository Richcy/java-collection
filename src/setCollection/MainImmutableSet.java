package setCollection;

import model.GenderEnum;

import java.util.EnumSet;
import java.util.Set;

public class MainImmutableSet {
    public static void main(String[] args) {
        Set<GenderEnum> gender = EnumSet.allOf(GenderEnum.class);
        System.out.println(gender);

        Set<String> immutSet = Set.of("Rizki", "Gania", "Resta");
        immutSet.remove("Andika");// error
        immutSet.add("Roni");// error
    }
}
