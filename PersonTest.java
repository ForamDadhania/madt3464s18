/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class PersonTest {
    
    public static void main(String args[])
    {
        Person foram = new Person();
        foram.name = "Foram";
        foram.address = "Toronto";
        foram.age = 25;
        
      //  System.out.println("Name : "+ foram.name + 
             //   "\n Address : " + foram.address + 
                      //  "\n Age : " +foram.age);
      
//        
////        Person daniel = new Person();
//        daniel.setName();
//        String nm = daniel.getName();
//        daniel.setAddress();
//        String add = daniel.getAddress();
//        daniel.setAge();
//        int age = daniel.getAge();
//        System.out.println("Name : " + nm + "\n Address : " + add + "\n Age : "+age);
//        
//        Person dan = new Person();
//        dan.setData();
//        System.out.println(dan.toString());
        
        Person aman = new Person();
        System.out.println(aman.toString());
    
        
        Person rimple = new Person("Rimple","North york",20);
        System.out.println(rimple.toString());
        
         Person rimple2 = new Person(rimple);
        System.out.println(rimple2.toString());
    }
    
}
