import java.util.*;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Interest Calculation:");

        System.out.print("\nEnter Principle Amount: ");
        int principleAmount = sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int rateOfInterest = sc.nextInt();

        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();

        double total = (principleAmount * rateOfInterest * time) / 100;

        System.out.print("\nTotal Amount: "+total);
    }}