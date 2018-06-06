/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5activity;
  import java.util.Scanner;
   
/**
 *
 * @author macstudent
 */
public class Day5activity {

   
   public static void main(String[] args)
     
    {
    /*StringBuffer  str1 =new StringBuffer ("It's only Daniel.");
      StringBuffer oldStringBuffer = new StringBuffer("It's only Daniel.");
     
   
        StringBuffer newStringBuffer = new StringBuffer(oldStringBuffer.toString().replaceAll("'", "''"));
        System.out.println(oldStringBuffer.toString());
        System.out.println(newStringBuffer.toString());*/
   
 

 
                

  
 
        String s;
    s="hi Mister geek is here";//input string 
    int j=0;//for tracking each word
    for(int i=0;i<s.length();i++)//loop for the string 
    {     
        if((int)s.charAt(i)==32/*if has  space checked by ascii code of the space */||i==s.length()-1/* for the end of string */)
        {
            for(int u=i;u>=j;u--)// loop for each word
                System.out.print(s.charAt(u));

            j=i; 
        }
    }  
        }
    }


    


        
    
    

