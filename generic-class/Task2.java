import java.util.*;

class Box<T>{
    T value;
}

public class Task2{
    public static void main(String[] args){
        Box<Integer> b1 = new Box<>();
        b1.value = 50;
        System.out.println(b1.value);

        Box <String> b2 = new Box<>();
        b2.value = "Java";
        System.out.println(b2.value);
    }
}