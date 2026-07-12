import java.util.*;

public class ModifyElement{
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[2] == 15){
                arr[2] = 100;
            }
        }
        for(int j = 0; j <= arr.length - 1; j++){
            System.out.print(arr[j]+" ");
        }
    }
}