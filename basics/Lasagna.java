import java.util.*;

public class Lasagna{

    private static final int expectedMinsInOven = 40;
    private static final int preparationTimePerLayer = 2;

    public int expectedMinutesInOven(){
        return expectedMinsInOven;
    }

    public int remainingMinutesInOven(int actualMinsInOven){
        return expectedMinutesInOven() - actualMinsInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return preparationTimePerLayer * numberOfLayers;
    }

    public int totalTimeInMinutes(int actualMinsInOven, int numberOfLayers){
        return preparationTimeInMinutes(numberOfLayers) + actualMinsInOven;
    }

    public static void main(String[] args){
        System.out.println("\nLet's Cook Lasagna!");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow Many Minutes Baked: ");
        int actualMinsInOven = sc.nextInt();
        
        System.out.print("\nNumber of Layers: ");
        int numberOfLayers = sc.nextInt();

        Lasagna lasagna = new Lasagna();
        System.out.print("\nExpected Minutes In Oven: "+lasagna.expectedMinutesInOven());
        
        System.out.print("\nRemaining Minutes In Oven: "+lasagna.remainingMinutesInOven(actualMinsInOven));

        System.out.print("\nPreparation Time In Minutes: "+lasagna.preparationTimeInMinutes(numberOfLayers));

        System.out.print("\nTotal Time In Minutes: "+lasagna.totalTimeInMinutes(actualMinsInOven, numberOfLayers));

    }

}