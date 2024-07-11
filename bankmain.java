package BankMangagement;

import java.util.*;

public class bankmain {
    public static void main(String[] args){
       Bank bank = new Bank();
       Scanner sc = new Scanner(System.in);
       while(true) {
           System.out.println("Enter 1 to create Account:");
           System.out.println("Enter 2 to deposit :");
           System.out.println("Enter 3 to withdraw money:");
           System.out.println("Enter 4 to checkBalacnce");
           System.out.println("Enter 5 to Exit");
           int count = sc.nextInt();
           switch (count){
               case 1:
                   System.out.println("Enter your Name:");
                   String holdersName = sc.nextLine();
                   sc.nextLine();
                   System.out.println("Give your 6 digit account number:");
                   String AccountNo = sc.nextLine();

                   System.out.println("Give your Initial balance:");
                   double InitIaBalance = sc.nextDouble();
                   bank.createAccount(holdersName,AccountNo,InitIaBalance);
                   break;
               case 2:
                   System.out.println("Enter your 6 digit number:");
                   String AN = sc.nextLine();
                   sc.nextLine();
                   System.out.println("Enter the amount whic you need to deposit:");

                   double Ns = sc.nextDouble();
                   sc.nextLine();
                   bank.deposit(AN,Ns);
                   break;
               case 3:
                   System.out.println("Enter your account Number : ");

                   String AccountNumber = sc.nextLine();
                   sc.nextLine();
                   System.out.println("Enter the amount whic you need to deposit:");

                   double withdraw = sc.nextDouble();
                   sc.nextLine();
                   bank.withdraw(AccountNumber,withdraw);
                   break;
               case 4:
                   System.out.println("Enter your account Number : ");

                   String Ac = sc.nextLine();
                   sc.nextLine();
                   bank.checkBalance(Ac);
                   break;
               case 5:
                   return;
                default:
                   System.out.println("Invalid infoo");

           }
       }
    }
}gi