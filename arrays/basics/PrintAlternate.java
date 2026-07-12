import java.util.*;

public class PrintAlternate{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int i = 0; i <= arr.length - 1; i++){
            if(i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}