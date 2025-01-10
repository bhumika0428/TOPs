package CollectionsFramework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

         map.put("1", "Apple");
        map.put("2", "Banana");
        map.put("3", "Cherry");
        map.put("4", "Date");

        System.out.println("Value for key '1': " + map.get("1"));
        System.out.println("Value for key '2': " + map.get("2"));
        System.out.println("Value for key '3': " + map.get("3"));

        boolean hasKey = map.containsKey("4");
        System.out.println("\nDoes the key '4' exist? " + hasKey);

        boolean hasValue = map.containsValue("Banana");
        System.out.println("Does the value 'Banana' exist? " + hasValue);

        map.remove("3");  
        System.out.println("\nKey-Value pairs in the HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("\nSize of the HashMap: " + map.size());

        boolean isEmpty = map.isEmpty();
        System.out.println("Is the HashMap empty? " + isEmpty);
    }
}
