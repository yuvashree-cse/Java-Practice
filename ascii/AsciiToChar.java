import java.util.*;

public class AsciiToChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ASCII to Char");
        System.out.print("Enter the ASCII value: ");

        int ascii = sc.nextInt();
        char value = (char)ascii;

        System.out.println("Char: "+value);

    }
}