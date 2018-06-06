/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author macstudent
 */
public class ExceptionHandling {
    public static void main(String args[])
    {   
        
        try{
        //int n = Integer.parseInt("123a");//int converted to string//at java.lang.NumberFormatException.forInputString
       int n = Integer.parseInt("123");
        System.out.println(n);
        
        
        n= n/n;
         System.out.println(n);
         
         int numbers[] = {10,20,30};
     System.out.println();
     
     
     if(n<150)
     {
     
     throw new NumberFormatException();
     }
     
        } catch(ArithmeticException e)
                {System.err.println(e);}
          // e.printStackTrace();}
     
    
    finally{
        
        System.out.println("the finally block");
        }
    
    }
}
