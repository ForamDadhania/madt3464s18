/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4activity;

import java.util.Scanner;

/**
 *
 * @author Foram
 */
public class Bank {
    String name;
    int id;
     Scanner in = new Scanner(System.in);
     
    //Default Constructor:
     
     Bank()
     {
         name = "Scotia";
         id = 12;
     }
     
     //Parameterized Constructor;
     Bank(String name,int id)
     {
        this.name = name;
        this.id = id;
     }
     
     void setName()
     {
        
         System.out.println("Enter The Name : ");
         name=in.nextLine();
     }
    ------------------------------------------------------------------------------------------------------------------------------------
        
package day4activity;
import java.util.Scanner;
public class Bank {
    
   String name;
   int id;
   Scanner in = new Scanner(System.in);
  
  Bank()
  {
      this.name="City Bank";
      this.id=1012;
  
  }
   
   void setName(/*String s*/)
   {
     System.out.println("Name: ");
     name= in.nextLine();
       //name = s;
   }
   
   String getName()
   {
      return name;
   }
    
  void setId()
  {
      System.out.println("ID :");
      id=Integer.parseInt(in.nextLine());
  
  }
  
  int getId()
  {
      return id;
  }
   
   @Override
   public String toString()
   {
       String data = "Name of the Bank : "+ name + "\nID :" +id;
       return data;
   
   }
}

    
     String getName()
    {
        return name;
    }
     
     void setId()
     {
         System.out.println("Enter The ID :");
         id = Integer.parseInt(in.nextLine());
      }
     
     int getId()
     {
         return id;
     }
     
     void setData()
     {
         setName();
         setId();
     }
     
    @Override
     public String toString()
     {
         String data = "Name : " + name + "Id : " + id;
         return data;
     }
     
     
}
