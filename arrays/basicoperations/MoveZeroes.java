import java.util.*;

public class MoveZeroes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 3, 5, 0, 0, 7, 7, 9};
        int[] arr2 = new int[arr1.length];
        int index = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != 0){
                arr2[index] = arr1[i];
                index++;
            }
        }
         while(index < arr2.length){
            arr2[index] = 0;
            index++;
            }
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}