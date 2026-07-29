import java.util.*;

public class AverageOfArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int[] arr = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            count++;
        }
        double average = (double)(sum / count);
        System.out.println(average);
    }
}