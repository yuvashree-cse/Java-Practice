import java.util.*;

public class Divisible3And5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("To check divisibility of a numbr by both 3 and 5");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by both 3 and 5");}

        else{
            System.out.println("Not Divisible");
        }
    }
}