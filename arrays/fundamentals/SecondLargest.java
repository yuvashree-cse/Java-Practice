import java.util.*;

public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of values: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest = arr[0];
        int secondLargest = arr[0];
        System.out.println("Enter the values: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
                if(arr[i] > secondLargest && arr[i] < largest){
                    secondLargest = arr[i];
                }
        }
        System.out.println("SecondLargest: "+secondLargest);
    }
}