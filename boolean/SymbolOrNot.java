import java.util.*;

public class SymbolOrNot{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Symbol Or Not");
        System.out.print("Enter a value: ");
        char value = sc.next().charAt(0);

        boolean isAlpha = (value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z');
        boolean isDigit = (value >= '0' && value <= '9');

        boolean isSymbol = !isAlpha && !isDigit;

        System.out.println(isSymbol);

    }
}