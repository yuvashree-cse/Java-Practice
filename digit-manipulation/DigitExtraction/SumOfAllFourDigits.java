import java.util.*;

public class SumOfAllFourDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any 4 digit number: ");
        int num = sc.nextInt();
        int firstdigit = num / 1000;
        int seconddigit = (num / 100) % 10;
        int thirddigit = (num % 100) / 10;
        int lastdigit = num % 10;

        int sum = firstdigit + seconddigit + thirddigit + lastdigit;
        System.out.print("\nSum Of All Four Digits: "+sum);
    }
}