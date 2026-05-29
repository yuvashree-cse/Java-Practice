import java.util.*;

public class Addition{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of Two Numbers: ");

        System.out.print("\nEnter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Sum: " + (num1 + num2));
    }
}