import java.util.*;

public class RemoveDuplicatesSorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        for(int i = 0; i < arr.length; i++){
                boolean duplicate = false;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }}
                if(!duplicate){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
