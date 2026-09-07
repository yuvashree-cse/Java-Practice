import java.util.*;

public class SubstringWithCornersAsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for(int start = 0; start < s.length(); start++) {
            for(int end = start + 1; end < s.length(); end++) {
                if(s.charAt(start) == '1' && s.charAt(end) == '1') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}