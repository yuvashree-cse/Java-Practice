import java.util.*;

public class LowerCaseOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lower Case Or Not");
        System.out.print("Enter a character: ");
        
        char alphabet = sc.next().charAt(0);

        boolean isLowerCase = alphabet >= 'a' && alphabet <= 'z';
        System.out.print(isLowerCase);
    }
}