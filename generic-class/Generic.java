import java.util.*;

class Box <T>{
    T value;
    
    Box (T value){
        this.value = value;
        }
    
    void show(){
        System.out.println(value);
    }

}

public class Generic{
    public static void main(String[] args){
        Box <Integer> b1 = new Box <>(10);

        Box <String> b2 = new Box <>("Yuvi");

        b1.show();
        b2.show();
    }
}