import java.util.*;

public class LowerCaseToUpperCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int num = ch - 32;
        ch = (char)num;
        System.out.println(ch);       
    }
}