import java.util.*;

public class PrintIndex{
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 15;
        arr[1] = 25;
        arr[2] = 35;
        arr[3] = 45;
        for(int i = 0; i <= 3; i++){
            System.out.println("Index "+i+" = "+arr[i]);
        }
    }
}