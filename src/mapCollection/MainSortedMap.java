package mapCollection;

import model.Person;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class MainSortedMap {
    public static void main(String[] args) {
        SortedMap<Person, String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map.put(new Person("Richcy"),"Richcy");
        map.put(new Person("Dian"),"Dian");
        map.put(new Person("Sukma"),"Sukma");

        for (var key : map.entrySet()){
            System.out.println(key);
        }
    }

}
