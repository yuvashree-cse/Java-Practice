import java.util.*;

public class GiftingCandies{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nToday is March 21 (My Birthday)!!!");
        System.out.println("Let's gift candies to everyone!!!");

        System.out.print("\nTotal number of Candies: ");
        int candies = sc.nextInt();

        System.out.print("\nTotal Number of people: ");
        int people = sc.nextInt();

        int giftedCandies = candies / people;
        int leftover = candies % people;

        System.out.print("\nTotal candies gifted: "+giftedCandies+" candies per person with leftover of "+leftover+" candies.");
    }
}