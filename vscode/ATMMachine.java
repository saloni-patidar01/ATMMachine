package vscode;
import java.util.*;


class ATM {
    float Balance;
    int PIN=5642;

    public void checkpin(){
        System.out.println("Enter your pin: ");
        try( Scanner sc=new Scanner (System.in)) {
        int enteredpin =sc.nextInt();
        if(enteredpin==PIN){
              menu();
        } 
        else {
            System.out.println("Enter a valid pin");
            menu();
        }
        } 
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
              
              
        try( Scanner sc =new Scanner(System.in)){
            int opt =sc.nextInt();

            if(opt==1){
                checkBalance();
            }
            else if (opt==2){
                WithdrawMoney();
            }
            else if (opt==3){
                DepositMoney();
            }
            else if(opt==4){
                return;
            }
            else {
                System.out.println("Enter a valid choice");
            }
        }
    }
              
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter Amount to Witndraw: ");
        try (Scanner sc = new Scanner(System.in)){
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl successful");
                      
        }
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter the Amount");
        try(Scanner sc=new Scanner(System.in)){
            float amount= sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("Money Deposited Successfully");
            menu(); 
        }
    }
}    
public class ATMMachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}