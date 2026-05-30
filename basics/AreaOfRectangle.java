import java.util.*;

public class AreaOfRectangle{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLet's Find Area of Rectangle");

        System.out.print("\nEnter Length (in cm): ");
        float length = sc.nextFloat();
        
        System.out.print("Enter Breadth (in cm): \n");
        float breadth = sc.nextFloat();

        System.out.print("Area of Rectangle: "+ (length * breadth));
    }
}