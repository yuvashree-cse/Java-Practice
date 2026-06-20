import java.util.*;

public class VowelOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vowel or Not");
        System.out.print("Enter a character: ");
        char alphabet = sc.next().charAt(0);

        boolean isVowel = (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U');
        System.out.print(isVowel);
    }
}