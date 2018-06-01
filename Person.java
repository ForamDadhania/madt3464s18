
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
    String address;
    int age;
    Scanner in = new Scanner(System.in);
    
    //defaut constructor
    
    Person()
    {
    name = "Unknown";
    address = "Unknown";
    age = 1;
    }
    // parameterized constructor
    Person(String name,String address,int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    //copy constructor
    Person(Person anotherPerson)
    {
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.age = anotherPerson.age;
    }
    
    
    void setName()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = in.nextLine();//will read an entire line
    }
    
    String getName()
    {
        return name;
    }
    
    String setAddress()
    {
        System.out.println("Enter your address : ");
        address = in.nextLine();
        return null;
    }
    
    String getAddress()
    {
        return address;
    }
       
    void setAge()
    {
        System.out.println("Enter your age : ");
        age = Integer.parseInt(in.nextLine());
    }
    
    int getAge()
    {
        return age;
    }
   
    void setData()
    {
        setName();
        setAddress();
        setAge();
    }
    
     @Override
    public String toString()
    {
        String data = "Name : "+ name + "\n Address : " + address + "\n Age : " + age;
        return data;
    }
}
