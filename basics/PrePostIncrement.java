import java.util.*;

public class PrePostIncrement{
    public static void main(String[] args){
        int x = 5;
        int a = x++;
        int b = ++x;
        
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
}