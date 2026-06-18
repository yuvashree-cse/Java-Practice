import java.util.*;

public class ATMwithdrawal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ATM Withdrawal");

        System.out.print("Enter account balance: ");
        int Acc_Balance = sc.nextInt();

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if(amount > Acc_Balance || amount % 100 != 0){
            System.out.println("Transaction Failed");
        }
        else{
            System.out.print("Transaction Successful");
        }
    }
}