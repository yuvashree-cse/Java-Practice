import java.util.*;

class Pair<T, U>{
    T value1;
    U value2;
}

public class Task4{
    public static void main(String[] args){
        Pair<String, Integer> a = new Pair<>();
        Pair<String, Integer> b = new Pair<>();
        
        a.value1 = "Yuvi";
        System.out.println(a.value1);

        b.value2 = 20;
        System.out.println(b.value2);
    }
}