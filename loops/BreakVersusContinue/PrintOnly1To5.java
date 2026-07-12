import java.util.*;

public class PrintOnly1To5{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i == 6){
                break;
            }
        System.out.println(i);
        }
    }
}