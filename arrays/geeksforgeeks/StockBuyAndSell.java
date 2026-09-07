import java.util.Scanner;

public class StockBuySell {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int prices[] = new int[n];
        System.out.println("Enter stock prices:");
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int profit = 0;
        for(int i = 0; i < n - 1; i++){
            if(prices[i + 1] > prices[i]){
                profit = profit + (prices[i + 1] - prices[i]);
            }
        }
        System.out.println(profit);
        sc.close();
    }
}