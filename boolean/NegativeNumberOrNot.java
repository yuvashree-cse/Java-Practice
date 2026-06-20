import java.util.*;

public class NegativeNumberOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Negative Number Or Not");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isNegative = num < 0;

        System.out.println(isNegative);
    }
}