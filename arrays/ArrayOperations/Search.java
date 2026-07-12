import java.util.*;

public class Search{
    public static void main(String[] args){
        int[] arr = {10, 25, 30, 45, 60};
        int target = 45;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element "+target+" Found on index "+i);
            }
        }
    }
}