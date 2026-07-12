import java.util.*;

public class AverageOfNumbers{
public static void main(String[] args){
    int count = 0;
    int sum = 0;
    for(int i = 1; i <= 10; i++){
        sum = sum + i;
        count++;
    }
    double average = (double)sum / count;
    System.out.println(sum);
    System.out.println(count);
    System.out.println(average);
}
}