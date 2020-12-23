package BT3;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "ABC");
        treeMap.put(2, "ABC");
        treeMap.put(3, "ABC");
        treeMap.put(4, "ABC");
        treeMap.put(5, "ABC");
        for (var index : treeMap.keySet()) {
            var value = treeMap.get(index);
            System.out.println(value);
        }
    }
}
