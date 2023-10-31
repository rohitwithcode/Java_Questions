package Chapter_7_Methods;
/*
     Create a Java program that simulates a simple ATM machine.
     It should allow users to check their balance, deposit money, and withdraw money.
 */
import java.util.Scanner;

public class ATM_machine {

       private static double balance=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your bank balance : ");
        balance=scanner.nextDouble();

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        System.out.println("Enter your choice : ");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                checkBalance();
                break;

            case 2:
                depositMoney();
                break;

            case 3:
                withdrawMoney();
                break;

            default:
                System.out.println("You entered invalid please try again...");

        }
    }
    public static void checkBalance(){
        System.out.println("Your current balance is : Rs "+balance);
    }
    public static void depositMoney(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the deposit amount : ");
        double depositAmount=scanner.nextDouble();
        if (depositAmount>0){
            balance=balance+depositAmount;
            System.out.println("Your current Balance : Rs "+balance+" after deposit : Rs "+depositAmount);
        }
        else {
            System.out.println("Please enter a valid input to deposit amount :");
        }
    }
    public static void withdrawMoney(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the withdraw amount : ");
        double withdrawAmount=scanner.nextDouble();

        if (withdrawAmount>0 && withdrawAmount<=balance){
            balance=balance-withdrawAmount;
            System.out.println("Your current balance in your account is : Rs"+balance+" after withdraw : Rs "+withdrawAmount);
        } else if (withdrawAmount>balance) {
            System.out.println("Insufficient Balance , Please enter valid amount to withdraw.");
        }
        else {
            System.out.println("Please enter valid input to withdraw amount.");
        }
    }
}
