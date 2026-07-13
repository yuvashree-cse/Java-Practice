import java.util.*;

public class HashMapBasics{
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        System.out.println(map);
        System.out.println(map.get(2));
        map.put(2, 50);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
        System.out.println(map.size());
        map.remove(1);
        System.out.println(map);
    }
}