import java.util.Scanner;

public class OnlyRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int repeating = 0;
        for(int i = 1; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[j] == i)
                {
                    count++;
                }
            }
            if(count == 2){
                repeating = i;
                break;
            }
        }
        System.out.println("Repeating number = " + repeating);
        sc.close();
    }
}