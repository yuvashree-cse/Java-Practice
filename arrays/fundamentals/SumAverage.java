import java.util.*;

public class SumAverage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of values: ");
        int n = sc.nextInt();
        int sum = 0, count = 0;
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            count++;
        }
        System.out.print("Sum: "+sum+"\n");

        double average = (double) sum / count;
        System.out.print("Average: "+average);
    }
}