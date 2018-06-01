/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day3 {
    public static void main(String args[])
    {
        Arithmatic operation1 = new Arithmatic();//creating an obj
        operation1.num1 =20;
        System.out.println("num1: " + operation1.num1);
        operation1.addition();
        
        int sum = operation1.addition(23,45);
        System.out.println("sum " + sum);
        
        float fsum= operation1.addition(123.45f,334.8f);
        System.out.println("float sum= " + fsum);
    
    
        int []numbers = {10,20,40,70};
        operation1.addition(numbers);
        
        operation1.addition(1,2,3);
        
        operation1.addition(1,2,56,87,39,60);
    
    
    }
}
