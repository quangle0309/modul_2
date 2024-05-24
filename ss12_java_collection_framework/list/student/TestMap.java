package ss12_java_collection_framework.list.student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Quang", 22);
        hashMap.put("Phong", 26);
        hashMap.put("Ky", 26);
        hashMap.put("Hieu", 23);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending oder of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Quang", 22);
        linkedHashMap.put("Phong", 26);
        linkedHashMap.put("Ky", 26);
        linkedHashMap.put("Hieu", 23);
        System.out.println("\nThe age for Quang is " + linkedHashMap.get("Quang"));
    }
}
