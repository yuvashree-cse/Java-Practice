import java.util.*;

public class SearchElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        for(int j = 0; j < n; j++){
            if(arr[j] == search){
                System.out.print("Element fount on index "+j);
                return;
            }
        }
        System.out.print("Not Found");
    }
}