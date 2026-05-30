import java.util.*;

public class SwapTwoNumbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's Swap Numbers: ");

        System.out.print("\nEnter a number in 'a': ");
        int a = sc.nextInt();

        System.out.print("Enter a number in 'b': ");
        int b = sc.nextInt();

        int swap = a;
        a = b;
        b = swap;

        System.out.println("\nNumbers after Swapping: \na = "+a+", b = "+b);
    }
}