import java.util.*;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.print("Enter any number (1-6): ");
        int option = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("You chose Addition");
                System.out.print("Sum of "+num1+" and "+num2+" = "+(num1 + num2));
                break;
            case 2:
                System.out.println("You chose Subtraction");
                System.out.print("Difference of "+num1+" and "+num2+" = "+(num1 - num2));
                break;
            case 3:
                System.out.println("You chose Multiplication");
                System.out.print("Product of "+num1+" and "+num2+" = "+(num1 * num2));
                break;
            case 4:
                System.out.println("You chose Division");
                System.out.print("Quotient of "+num1+" and "+num2+" = "+(num1 / num2));
                break;
            case 5:
                System.out.println("You chose Modulus");
                System.out.print("Remainder of "+num1+" and "+num2+" = "+(num1 % num2));
                break;
            case 6:
                System.out.println("You chose Power");
                System.out.print("Power of "+num1+" and "+num2+" = "+(num1 ^ num2));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }
}