import java.util.*;

public class ArrayDeclaration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\n");
        int[] arr2 = {5, 10, 15, 20, 25};
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}