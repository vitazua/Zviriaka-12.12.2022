package HomeTask9;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "bmw");
        map.put(2, "volvo");
        map.put(3, "audi");
        map.put(4, "skoda");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

