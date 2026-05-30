import java.util.*;

public class RupeesToDollars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nConvert Rupees to Dollars");

        System.out.print("\nEnter the amount in rupees: ");
        double rupees = sc.nextDouble();

        System.out.print("\nEnter exchange rate: ");
        double exchangerate = sc.nextDouble();

        double dollars = rupees / exchangerate;
        System.out.println("\nOn Conversion, we get: "+dollars+" dollars");
    }
}