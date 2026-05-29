import java.util.*;

public class Calculator{

    public static void main(String[] args){
        
        System.out.println("\nBasic Calculator for 2 Numbers:\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("\nEnter Number 2: ");
        int num2 = sc.nextInt();

        System.out.print("\nAddition:"+ (num1 + num2));
        System.out.print("\nSubtraction:"+ (num1 - num2));
        System.out.print("\nMultiplication:"+ (num1 * num2));
        System.out.print("\nDivision:"+ num1 / num2);

    }
}