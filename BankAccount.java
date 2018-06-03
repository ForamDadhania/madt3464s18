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
public class BankAccount extends Bank 
{
    String actNo;
    String ownerName;
    int total,total1,depo,wd,balAmt,num;
    Scanner in = new Scanner(System.in);

//------Using Constructors-----------------------------------------------------
//Default Constructor
BankAccount()
{
    super();
    this.actNo = "4528############";
    this.ownerName = "Foram";
    this.balAmt = 1743;
}

//Parameteized constructor
BankAccount(String actNo,String ownerName,int balAmt,String name,int id)
{
    super(name,id);
     this.actNo = actNo;
    this.ownerName = ownerName;
    this.balAmt = balAmt;
}
           @Override
            public String toString()
            {
                String accountDetails=super.toString();
                String data = "Accout Number : " + this.actNo + "\n Owner's Name : " 
                        + this.ownerName + "\n Balance Amount : " + this.balAmt;
                return data;
            }

//---------------Methods--------------------------------------------------------

 

}
-------------------------------------------------------------------------------------------------------------------------------------

package day4activity;


public class BankAccount extends Bank{
    
  String oName;
  int actNo;
  int balAmt;
  
BankAccount()
{
   super();
    this.oName = "Foram";
    this.actNo = 1603;
    this.balAmt=2000;
}

@Override
public String toString()
{
    String details = super.toString();
    String data = "Name: " + this.oName+ "\nAccount No : " 
            + this.actNo + "\nBalance amout : " + this.balAmt;
    return data;
}
    
}








