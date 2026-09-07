import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int st = 1;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < st; j++){
                System.out.print("* ");
            }
            System.out.println();
            st++;
        }
    }
}