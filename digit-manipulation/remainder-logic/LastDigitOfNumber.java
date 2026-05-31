import java.util.*;

public class LastDigitOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTo obtain Last Digit of a 3-digit Number: ");
        System.out.print("\nEnter a 3-digit number: ");
        int num = sc.nextInt();
        int lastdigit = num % 10;
        System.out.print("\nLast Digit: "+lastdigit);

    }
}