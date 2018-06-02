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





    
    
    
    
      
      
    

