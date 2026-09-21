import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int one = 0;
        int ten = 0;
        int hundred = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();

            int bill = (A + 999) / 1000;
            int change = bill * 1000 - A;

            hundred += change / 100;
            change %= 100;

            ten += change / 10;
            change %= 10;

            one += change;
        }

        System.out.println(one + " " + ten + " " + hundred);
    }
}