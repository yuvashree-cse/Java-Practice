import java.util.*;

public class Substring{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String main = sc.nextLine();
        String sub = sc.nextLine();

        if(main.contains(sub)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");

        }

    }
}