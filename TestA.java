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
public class TestA  implements A, B , C//you can not extend multipule classes only multiple interfaces
{
    @Override
    public void display()//specify the type of the method I.e. public
    {
        System.out.println("number in class A : " + number );
        
    }
    
  /*  public void show()
            
    {
        System.out.println("Now B interface is running" );
        
    }*/
    
    @Override
    public void output()
    {
        System.out.println("C inherits B");
    }
}
