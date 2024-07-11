package BankMangagement;

import java.util.HashMap;

public class Bank {
   private  HashMap<String,Account> account;

   public Bank(){
       account = new HashMap<>();
   }

   public void createAccount(String AccountNo,String HoldersName,double InitialBalance){

       if(!account.containsKey(AccountNo)){
            Account accountr = new Account(AccountNo,HoldersName,InitialBalance);
            account.put(AccountNo,accountr);
            System.out.println("Your's Account initialyzed Successfully");
       }else{
           System.out.println("Acount Already exists");
       }
   }
   public void withdraw(String AccountNo,double amount){
         Account accounts = account.get(AccountNo);
         if(accounts != null){
             accounts.withdraw(amount);
         }else{
             System.out.println("Wrong Account num");
         }
   }
   public void deposit(String AccountNo,double amount){
       Account accounts = account.get(AccountNo);
           if(accounts != null){
               accounts.deposit(amount);
           }
           else {
               System.out.println("Wrong Account num");
           }

   }
   public void checkBalance(String AccountNo){
       Account accounts = account.get(AccountNo);
       if(accounts != null){
           System.out.println("The balance of Account(" + AccountNo + ") number is"+ accounts.getBalance());
       }else{
           System.out.println("The Acoount is not exists");
       }
   }

}
