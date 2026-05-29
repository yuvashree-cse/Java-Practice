import java.util.*;

public class Multiplication{
    public static void main(String[] args){
        System.out.println("\nProduct of Three Numbers");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        int product = num1 * num2 * num3;

        System.out.print("\nProduct: "+product);

    }
}