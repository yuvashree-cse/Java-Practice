import java.util.*;

public class CharToAscii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Char to ASCII");
        System.out.print("Enter a value: ");
        char value = sc.next().charAt(0);

        int ascii = value;
        System.out.print("ASCII: "+ascii);
    }
}