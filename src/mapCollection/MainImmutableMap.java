package mapCollection;

import java.util.Map;

public class MainImmutableMap {
    public static void main(String[] args) {
        Map<String, String> name = Map.of(
                "firstName", "Richcy",
                "middleName", "Dian",
                "lastName", "Sukma"
        );
        name.put("middleName", "Ups"); //errpr
    }
}
