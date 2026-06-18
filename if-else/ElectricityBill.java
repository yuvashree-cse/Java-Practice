import java.util.*;

public class ElectricityBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units to calculate Electricity Bill");

        int units = sc.nextInt();

        if(units <= 100){
            int bill = 2 * units;
            System.out.print("The Electricity Bill is: "+bill+" rupees");
        }
        else if(units <= 200){
            int bill = ((units - 100) * 3) + (100 * 2);
            System.out.print("The Electricity Bill is: "+bill+" rupees");
        }
        else{
            int bill = ((100 * 2) + (100 * 3) + ((units - 200) * 5));
            System.out.print("The Electricity Bill is: "+bill+" rupees");
        }
    }
}