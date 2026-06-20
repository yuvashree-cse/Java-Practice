import java.util.*;

public class EqualOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Equal Or Not");

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        boolean isEqual = (num1 == num2);

        System.out.print(isEqual);
    }
}