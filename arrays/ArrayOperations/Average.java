import java.util.*;

public class Average{
    public static void main(String[] args){
        int sum = 0;
        int count = 0;
        int[] arr = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            count++;
        }
        double average = (double)(sum / count);
        System.out.println(average);
    }
}