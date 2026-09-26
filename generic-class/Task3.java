import java.util.*;

class Container<T>{
    T value;

    Container(T value){
        this.value = value;
    }

    void show(){
        System.out.println(value);
    }
}

public class Task3{
    public static void main(String[] args){
        Container<Integer> num = new Container<>(100);
        num.show();
    }
}