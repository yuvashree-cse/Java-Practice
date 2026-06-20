import java.util.*;

public class PositiveNumberOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Positive Number Or Not");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPositive = num > 0;
        System.out.print(isPositive);
    }
}