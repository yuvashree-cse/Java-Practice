import java.util.*;

public class DivisibleBy3{
    public static void main(String[] args){
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}