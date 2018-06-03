/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4activity;

/**
 *
 * @author Foram
 */
public class Day4activity {

   
    public static void main(String[] args) 
    {
        //for parameterized constructor;
     BankAccount ba = new BankAccount("1603","Foram",45,"Scotia",1); 
    
      System.out.println(" Bank Name : " + ba.name + "\n ID :" + ba.id );
      
      System.out.println(ba.toString());
      
      //for default constructor;
      
      BankAccount ba1 = new BankAccount();
       System.out.println(ba1.toString());
       
      
       
       OverdraftAccount withdraw1 = new OverdraftAccount();
       withdraw1.withdraw();
        
        
         //OverdraftAccount deposite1 = new OverdraftAccount();
        //deposite1.deposite();
        
       
       
      
       
      // if(num==1)
     //  {
         //  withdraw1.withdraw();
       
   //    }
    //   else
       
       
      
       
    }
    
}

---------------------------------------------------------------------------------------------------------------------------------------
   package day4activity;

import java.util.Scanner;


/**
 *
 * @author Foram
 */
public class Day4Activity {
    

   
    public static void main(String[] args) {
        
         Bank b1 = new Bank();
         System.out.println(b1.toString());
         
         BankAccount ba = new BankAccount();
         System.out.println(ba.toString());
         
         OverdraftAccount actions1 = new OverdraftAccount();
         actions1.actions();
    }
}
