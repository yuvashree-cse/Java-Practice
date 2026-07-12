import java.util.*;

public class Maximum{
    public static void main(String[] args){
        int[] arr = {4, 8, 2, 10, 6};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}