import java.util.*;

class Printer<T, U, V>{
    T value1;
    U value2;
    V value3;

    Printer(T value1, U value2, V value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    void show(){
        System.out.println(value1+" "+value2+" "+value3);
    }
}

public class Task5{
    public static void main(String[] args){
        Printer<Integer, String, Double> a = new Printer<>(2006, "Yuvi", 20.5);

        a.show();
    }
}