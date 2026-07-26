import java.util.*;

public class MaxElement{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    for(int j = 0; j < n; j++){
        if(arr[j] > max){
            max = arr[j];
        }
    }
    System.out.println(max);
}}