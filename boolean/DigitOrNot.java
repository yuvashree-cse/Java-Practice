import java.util.*;

public class DigitOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digit or Not");
        System.out.print("Enter a value: ");
        char digit = sc.next().charAt(0);

        boolean isDigit = (digit >= '0' && digit <= '9');
        System.out.print(isDigit);

    }
}