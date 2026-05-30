import java.util.*;

public class TenSecondBlocks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNumber of Ten Second Blocks in given seconds:");
        System.out.print("\nEnter time(in seconds): ");
        int seconds = sc.nextInt();
        int blocks = seconds / 10;
        System.out.print("\nTotal Number of 10 second blocks: "+blocks);
    }
}