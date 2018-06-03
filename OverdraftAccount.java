/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4activity;
import java.util.Scanner;
/**
 *
 * @author macstudent
 */
public class OverdraftAccount extends BankAccount {
 
     
   /* void deposite()
       {
       
         System.out.println("Amout to be deposited: ");
         depo =Integer.parseInt(in.nextLine());
         total=balAmt+depo;
         System.out.println("You have now "+ total+ " in your account."
           + "\n Thank you for choosing " + this.name + ".\n Have a nice day.");
       }*/
    
        void withdraw()
        {
         System.out.println("You have an overdraft limit of");
        System.out.println("Amout to be Withdrawn: ");
         wd =Integer.parseInt(in.nextLine());
         total=balAmt-wd;
          total1=1500+total;
          if(total1>1500)
    
          {System.out.println("Amount exceeds an overdraft limit.");}
  
    
    else {
         System.out.println("You have "+ total+ " left in your account."
           + "\n Thank you for choosing " + this.name + ".\n Have a nice day.");}
        }
    
   
        
        
        
        
        
}
--------------------------------------------------------------------------------------------------------------------------------------
 package day4activity;
import java.util.Scanner;



public class OverdraftAccount extends BankAccount {
   Scanner input = new Scanner(System.in);
    int wd,total,depo,totald;
   
  public void actions()
   {
       int num;
        
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposite");
        System.out.println("3. Current Balance");
        System.out.println();
        System.out.println("Chose your action.");
        
        num = input.nextInt();
         
        while(num>=1|| num<=3)
        {
        
            switch(num)
            {
               case 1: 
                     { 
                     System.out.println("You have an overdraft limit of 1500.");
                     System.out.println("Amout to be Withdrawn: ");
                     wd =Integer.parseInt(in.nextLine());
                     total=balAmt-wd;
                     if(total<=-1500)
                     {
                        
                           System.out.println("You are trying to withdraw beyound your overdraft limit.\n Please enter a valid amount.");
                     }
                     
                     else if(total<=0)
                     {
                     System.out.println("You have exhusted your account. And You are now withdrawing " + (0-(total)) + " from your overdarft limit. "
                                 + "\nOverdraft limit remaining is " + (1500+total));
                     System.out.println("Transition Successful");
                     System.out.println("Thank you for choosing City Bank.\nHave a nice day.");
                      }    
                     
                     else
                     {
                     System.out.println("Transition Successful");
                     System.out.println("Total amount after withdrawal : " + total);
                     System.out.println("Thank you for choosing City Bank.\nHave a nice day.");
                     }}
                     break;
                   
                case 2:
                    System.out.println("Enter the amount to be deposited : ");
                    depo = Integer.parseInt(in.nextLine());
                    totald= balAmt+depo;
                    System.out.println("Transition Successful");
                    System.out.println("Total amount after deposite : "+ totald);
                    System.out.println("Thank you for choosing City Bank.\nHave a nice day.");
                    break;
                    
                case 3:
                    System.out.println("You currently have " + this.balAmt + " in your account.");
                    break;
                    
                default:
                            System.out.println("Please enter a valid choice.");
            }
            break;
        }
   }
}
        
                                
                    
                             
                            
                     
                    
                    






    
    
    
    
      
      
    

