import java.util.*;

public class SquareAndCube{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nFinding Square And Cube");
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.print("Square: "+square);
        System.out.print("\nCube: "+cube);
    }
}