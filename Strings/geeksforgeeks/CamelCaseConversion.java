import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        boolean makeUpper = false;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                makeUpper = true;
            } 
            else {
                if(makeUpper){
                    ch = Character.toUpperCase(ch);
                    makeUpper = false;
                }
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}