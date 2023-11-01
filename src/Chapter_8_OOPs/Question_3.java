package Chapter_8_OOPs;
/*
    Develop a class BankAccount with attributes for an account holder's name and balance.
    Include methods to deposit and withdraw money, and display the account details.
 */

import java.util.Scanner;

class BankAccount{
    Scanner scanner=new Scanner(System.in);

    String accountHolderName;
    double accountBalance;
    BankAccount(){
        accountBalance=10000;
        System.out.print("Enter the name of the account Holder name : ");
        accountHolderName=scanner.nextLine();
    }


    public void depositMoney(){
        System.out.print("Enter the money which you want to deposit in your account : ");
        double depositAmount=scanner.nextDouble();

        accountBalance=accountBalance+depositAmount;
    }

    public void withdrawBalance(){
        System.out.print("Enter the withdraw amount : ");
        double withdrawAmount=scanner.nextDouble();
        if (accountBalance>=withdrawAmount && withdrawAmount>0){
            accountBalance=accountBalance-withdrawAmount;
        }
        else {
            System.out.println("Insufficient Balance : ");
        }
    }
    public void displayAccountDetails(){
        System.out.println("The Name of the account Holder : "+accountHolderName);
        System.out.println("The Balance of the account Holder : "+accountBalance);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();

        bankAccount.displayAccountDetails();
        bankAccount.depositMoney();
        bankAccount.withdrawBalance();
        bankAccount.displayAccountDetails();

    }
}
