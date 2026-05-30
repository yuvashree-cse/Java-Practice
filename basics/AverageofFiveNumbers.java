import java.util.*;

public class AverageofFiveNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAverage of Five Numbers: ");
        System.out.print("\nEnter five numbers: \n");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        float num5 = sc.nextFloat();

        float average = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.print("Average: "+average);
    }
}