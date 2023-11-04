package Chapter_10_Inheritence;
/*
    Define a class hierarchy for a basic banking system. Create a base class called "Account" with fields for account number and balance.
    Create subclasses for "SavingsAccount" and "CheckingAccount," each with methods for deposit and withdrawal specific to their account type.
 */

import java.util.Scanner;

class  Account{
    Scanner scanner=new Scanner(System.in);
    int accountNumber;
     double accountBalance;
    Account(int accountBalance,int accountNumber){
        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
    }

    public void depositAmount(){
        System.out.println("Enter the amount to deposit : ");
        double dAmount= scanner.nextDouble();
        if(dAmount>0){
            accountBalance=accountBalance+dAmount;
        }
        else {
            System.out.println("Invalid deposit amount !!!!!");
        }
    }
    public void withdrawalAmount(){
        System.out.println("Enter the withdrawal amount : ");
        double wAmount=scanner.nextDouble();
        if(wAmount>0 && wAmount<=accountBalance){
            accountBalance=accountBalance-wAmount;
        }
        else {
            System.out.println("Invalid withdrawal amount Insufficient Balance !!!!!");
        }
    }
    public void displayAccountInformation(){
        System.out.println("The Account Number : "+accountNumber);
        System.out.println("The Account Balance : "+accountBalance);
    }
}

class Saving_Account extends Account{
    double interestRate;
    Saving_Account(int accountBalance, int accountNumber,double interestRate) {
        super(accountBalance, accountNumber);
        this.interestRate=interestRate;
    }
    public void applyInterest(){
        double interest = (accountBalance + interestRate)/100;
        accountBalance=accountNumber+interest;
        System.out.println("The Interest Applied : "+interest);
    }
}

class  Checking_Account extends Account{
    Checking_Account(int accountBalance, int accountNumber) {
        super(accountBalance, accountNumber);
    }
//    @Override
//    public void displayAccountInformation(){
//        System.out.println("The Account Number : "+accountNumber);
//        System.out.println("The Account Balance : "+accountBalance);
//    }
}


public class Question_1 {
    public static void main(String[] args) {
        Saving_Account saving_account=new Saving_Account(2000,203456,0.3);
        saving_account.depositAmount();
        saving_account.withdrawalAmount();
        saving_account.displayAccountInformation();
        saving_account.applyInterest();

        System.out.println("Checking Account : ");
        Checking_Account  checking_account=new Checking_Account(3000,404040);
        checking_account.depositAmount();
        checking_account.withdrawalAmount();
        checking_account.displayAccountInformation();
    }
}
