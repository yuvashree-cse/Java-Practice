import java.util.*;

public class SecondLargest{
    public static void main(String[] args){
        int[] arr = {6, 2, 4, 10, 8};
        int Largest = arr[0];
        int SecondLargest = arr[1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Largest){
                Largest = arr[i];
            }
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < Largest && arr[j] > SecondLargest){
                    SecondLargest = arr[j];
                }
            }
        }
        System.out.println(SecondLargest);
    }
}