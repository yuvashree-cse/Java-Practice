import java.util.*;

public class ConsonantOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Consonant Or Not");
        System.out.print("Enter a character: ");
        char alphabet = sc.next().charAt(0);

        boolean isConsonant = alphabet != 'a' && alphabet != 'e' && alphabet != 'i' && alphabet != 'o' && alphabet != 'u' && alphabet != 'A' && alphabet != 'E' && alphabet != 'I' && alphabet != 'O' && alphabet != 'U';
        System.out.print(isConsonant);

    }
}