import java.util.*;

public class ExtractMiddleIn3Digit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a 3 digit number: ");
        int num = sc.nextInt();

        int mid = (num % 100) / 10;
        System.out.println("Mid Digit: "+mid); 
    }
}