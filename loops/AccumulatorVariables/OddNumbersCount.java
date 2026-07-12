import java.util.*;

public class OddNumbersCount{
    public static void main(String[] args){
        int count = 0;
        for(int i = 50; i <= 100; i++){
            if(i % 2 != 0){
                count++;}}
        System.out.println(count);
    }
}