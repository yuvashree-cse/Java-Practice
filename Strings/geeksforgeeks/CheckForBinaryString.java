import java.util.*;

public class CheckForBinaryString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean binary = true;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != '1' && ch != '0'){
                binary = false;
                break;
            }
        }
        System.out.print(binary);
    }
}