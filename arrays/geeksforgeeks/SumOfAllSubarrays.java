import java.util.*;

public class SumOfAllSubarrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            int currentsum = 0;
            for(int j = i; j < n; j++){
                currentsum = currentsum + arr[j];
                sum = sum + currentsum;
            }
        }
        System.out.println("Sum: "+sum);
    }
}       
