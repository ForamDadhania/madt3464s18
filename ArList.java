/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class ArList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> productsName = new ArrayList<String>();
    productsName.add("Projector");
    productsName.add("Excel");
    productsName.add("Contigo");
    productsName.add("Apple");
    
    productsName.add(2,"Oracle");
    
  
    
   
    for(String raman : productsName)
    {
            System.out.println(raman);
    
    }
    
    System.out.println("---------------");
        // TODO code application logic here
        
         if(productsName.contains("Oracle"))
    {
         productsName.remove("Oracle");
    }
    
    else{
    
        System.err.println("Buy Oracle first.");
    }
    
    
   
    for(String raman : productsName)
    {
            System.out.println(raman);
    
    }
    Collections.sort(productsName);
            System.out.println("---------------");
            
              
    for(String raman : productsName)
    {
            System.out.println(raman);
    
    }
    
    ArrayList<Books1>library = new ArrayList<Books1>();
    Books1 book1 = new Books1(101, "Wings of fire",9);
      Books1 book2 = new Books1(102, "Pride and Prejudice",4);
        Books1 book3 = new Books1(103, "Wuthering Heights",6);
          Books1 book4 = new Books1(104, "The kite runner",5);
    
    
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4); 
        
        for(Books1 bk :library)
        {
            bk.displayInfo();
        
        }
        
        System.out.println("no. of books in library:"+library.size());
        
        library.add(2,new Books1(120,"Pearls",111));
        for(Books1 bk : library)
        {
            bk.displayInfo();
        }
        
      Collections.sort(library,new BooktitleComparator());
          for(Books1 bk: library)
          {
              bk.displayInfo();
          }
          
           Collections.sort(library,new bookratingComparator());
          for(Books1 bk: library)
          {
              bk.displayInfo();
          }
    }
    
}
