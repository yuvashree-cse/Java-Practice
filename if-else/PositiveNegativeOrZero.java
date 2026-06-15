import java.util.*;

public class PositiveNegativeOrZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.print("It's a Negative Number");}
        else if(num > 0){
            System.out.print("It's a Positive Number");}
        else{
            System.out.print("You entered Zero (0)");
        }
    }
}