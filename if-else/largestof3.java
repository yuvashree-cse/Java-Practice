import java.util.*;

public class largestof3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Largest of 3 Numbers: ");
        System.out.println("Enter the values for x, y and z: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x > y && x > z){
            System.out.print(x+" is the greatest");}
        else if(y > z){
            System.out.print(y+" is the greatest");}
        else{
            System.out.print(z+" is the greatest");}

   }
}