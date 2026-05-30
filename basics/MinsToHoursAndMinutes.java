import java.util.*;

public class MinsToHoursAndMinutes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nLet's Calculate Mins to Hours And Minutes");
        System.out.print("\n Enter time (in mins): ");
        float time = sc.nextDouble();

        float mins = time % 60;
        float hours = time / 60;

        System.out.print("\nTime conversion: "+hours+" hours and "+mins+" minutes");
    }
}