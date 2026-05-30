import java.util.*;

public class DaysToYearsMonthsDays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nConverting Days to Years, Months, Days");
        System.out.print("\nEnter Total number of Days: ");
        int days = sc.nextInt();

        int years = days / 365;
        days = days % 365;

        int months = days / 30;
        days = days % 30;
        
        System.out.print("\nAfter Conversion: "+years+" years, "+months+" months, "+days+" days.");
    }
}