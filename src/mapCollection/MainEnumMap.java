package mapCollection;

import java.util.EnumMap;

public class MainEnumMap {
    public static enum Level{
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        EnumMap<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Gratis");
        map.put(Level.STANDARD, "Bayar");
        map.put(Level.PREMIUM, "Bayar 2x");
        map.put(Level.VIP, "Bayar 3x");

        System.out.println(map.get(Level.FREE));
        System.out.println(map.get(Level.STANDARD));
        System.out.println(map.get(Level.PREMIUM));
        System.out.println(map.get(Level.VIP));
    }
}
