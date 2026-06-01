import java.util.*;

public class ReverseTheNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse The Number: ");
        System.out.print("Enter any 3 digit number: ");
        int num = sc.nextInt();
        
        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        int rev = (last * 100) + (middle * 10) + first;
        
        System.out.println("Reversed Number: "+rev);
    }
}