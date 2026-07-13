import java.util.*;

public class CharAt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("First char: "+str.charAt(0));
        System.out.println("Last char: "+str.charAt(str.length()-1));
    }
}