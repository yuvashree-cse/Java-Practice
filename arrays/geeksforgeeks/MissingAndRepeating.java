import java.util.*;

public class MissingRepeating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int missing = 0;
        int repeating = 0;

        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[j] == i)
                {
                    count++;
                }
            }
            if(count == 0)
            {
                missing = i;
            }
            if(count == 2)
            {
                repeating = i;
            }
        }
        System.out.println("Repeating number = " + repeating);
        System.out.println("Missing number = " + missing);
        sc.close();
    }
}