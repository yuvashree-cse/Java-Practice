import java.util.*;

public class Extract3digitNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nExtracting 3 digit number");
        System.out.print("\nEnter any 3 digit number: ");
        int num = sc.nextInt();
        int last = num % 10;
        int middle = (num / 10) % 10;
        int first = num / 100;

        System.out.println("\nExtracted digits: ");
        System.out.print("First Digit: "+first+"\n");
        System.out.print("Middle Digit: "+middle+"\n");
        System.out.print("Last Digit: "+last);
    }
}