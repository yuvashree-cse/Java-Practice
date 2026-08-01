import java.util.*;

public class Leaders{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 35, 57, 35, 87, 97, 45, 58, 37, 96, 30};
        for(int i = 0; i < arr.length; i++){
            boolean leader = true;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    leader = false;
                    break;
                }}
                if(leader){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
