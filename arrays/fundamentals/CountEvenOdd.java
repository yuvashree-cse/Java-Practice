import java.util.*;

public class CountEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of values: ");
        int n = sc.nextInt();
        int oddcount = 0, evencount = 0;
        int evensum = 0, oddsum = 0;
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                oddsum = oddsum + arr[i];
                oddcount++;
            }
            else{
                evensum = evensum + arr[i];
                evencount++;
            }
        }
        System.out.println("Odd count: "+oddcount);
        System.out.println("Even count: "+evencount);
        System.out.println("Odd sum: "+ oddsum);
        System.out.println("Even sum: "+evensum);

    }
}