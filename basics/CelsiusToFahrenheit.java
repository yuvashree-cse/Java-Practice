import java.util.*;

public class CelsiusToFahrenheit{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("CelsiusToFahrenheit Conversion");
        System.out.print("\nEnter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = 9.0/5.0 * celsius + 32;

        System.out.println("Fahrenheit: "+fahrenheit);
    }
}