import java.util.*;

public class MissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }
        
        int result = 0;

        for(int i = 1; i <= n; i++){
            result = result ^ i;
        }
        for(int i = 0; i < n-1; i++){
            result = result ^ arr[i];
        }
        System.out.println("Missing number = " + result);
        sc.close();

    }
}