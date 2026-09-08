/*********************************************************************************

    HashMap Built-in Methods (Java)

    A HashMap stores data in Key-Value pairs.

        Keys must be unique.
        Values can be duplicated.
        One null key is allowed.
        Multiple null values are allowed.
        No insertion order is guaranteed.
        Average Time Complexity: O(1)

*********************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put() - Insert key-value pair
        map.put(101, "Vijay");
        map.put(102, "Ajith");
        map.put(103, "Surya");
        map.put(104, "Karthi");

        System.out.println("put(): " + map);

        // 2. get() - Get value using key
        System.out.println("\nget(102): " + map.get(102));

        // 3. getOrDefault() - Returns value if key exists else default value
        System.out.println("\ngetOrDefault(110, 'Unknown'): "
                + map.getOrDefault(110, "Unknown"));

        // 4. containsKey()
        System.out.println("\ncontainsKey(103): "
                + map.containsKey(103));

        // 5. containsValue()
        System.out.println("containsValue('Surya'): "
                + map.containsValue("Surya"));

        // 6. replace() - Replace existing value
        map.replace(102, "Dhanush");
        System.out.println("\nreplace(): " + map);

        // 7. replace(oldValue, newValue)
        map.replace(103, "Surya", "Sivakarthikeyan");
        System.out.println("replace(old,new): " + map);

        // 8. putIfAbsent()
        //Insert this key-value pair only if the key does NOT already exist
        map.putIfAbsent(104, "Rajini");
        map.putIfAbsent(105, "Rajini");
        System.out.println("\nputIfAbsent(): " + map);

        // 9. remove(key)
        map.remove(105);
        System.out.println("\nremove(key): " + map);

        // 10. remove(key,value)
        map.remove(104, "Karthi");
        System.out.println("remove(key,value): " + map);

        // 11. keySet()
        System.out.println("\nkeySet(): " + map.keySet());

        // 12. values()
        System.out.println("values(): " + map.values());

        // 13. entrySet()
        System.out.println("entrySet(): " + map.entrySet());

        // 14. size()
        System.out.println("\nsize(): " + map.size());

        // 15. isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // 16. Iterating using keySet()
        System.out.println("\nIterating using keySet():");

        for(Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 17. Iterating using entrySet()
        System.out.println("\nIterating using entrySet():");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()
                    + " -> "
                    + entry.getValue());
        }

        // 18. forEach()
        System.out.println("\nforEach():");

        map.forEach((k, v) ->
                System.out.println(k + " -> " + v));

        // 19. clone()
        HashMap<Integer, String> copy =
                (HashMap<Integer, String>) map.clone();

        System.out.println("\nclone(): " + copy);

        // 20. Null key & value
        map.put(null, "Trainer");
        map.put(106, null);

        System.out.println("\nNull Key/Value:");
        System.out.println(map);

        // 21. clear()
        map.clear();

        System.out.println("\nclear(): " + map);

        // 22. isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());
    }
}