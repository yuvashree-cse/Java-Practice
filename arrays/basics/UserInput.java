import java.util.*;

public class UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i <= arr.length - 1; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j <= arr.length - 1; j++){
            System.out.print(arr[j]+" ");
        }
    }
}