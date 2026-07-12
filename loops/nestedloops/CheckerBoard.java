import java.util.*;

public class CheckerBoard{
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(i % 2 != 0 && j % 2 != 0 || i % 2 == 0 && j % 2 == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
            }
        System.out.println();
        }
    }
}