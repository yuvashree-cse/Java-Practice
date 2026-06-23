import java.util.*;

public class UpperCaseToLowerCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Upper Case To Lower Case");
        char value = sc.next().charAt(0);
        char lowercase = (char)(value + 32);
        System.out.print(lowercase);

    }
}