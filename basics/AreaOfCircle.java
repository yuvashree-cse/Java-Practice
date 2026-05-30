import java.util.*;

public class AreaOfCircle{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLet's find Area of Circle");

        System.out.print("\nEnter Radius (in cms): ");
        double radius = sc.nextDouble();
        System.out.print("Area of Circle: "+(3.14 * radius * radius));
    }
}