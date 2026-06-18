import java.util.*;

public class SecondLargestOf3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Second Largest of 3 Numbers\n");

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        System.out.print("Enter the third number: ");
        int z = sc.nextInt();

        if((x < y && x > z) || (x < z && x > y)){
            System.out.print(x+" is the Second Largest Number");
        }
        else if((y < z && y > x) || (y < x && y > z)){
            System.out.print(y+" is the Second Largest Number");
        }
        else{
            System.out.print(z+" is the Second Largest Number");
        }
    }
}