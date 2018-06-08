/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arlist;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books1 {
     int bookId;
    String Booktitle;
    int bookrating;
    
   Books1()
   {
       this.bookId=0;
       this.Booktitle="Unknown";
       this.bookrating=0;
   
   }
   Books1(int bookId, String Booktitle, int bookrating)
   {
   this.bookId=bookId;
       this.Booktitle=Booktitle;
       this.bookrating=bookrating;
   }
   
   void setID(int ID)
   {
       this.bookId=ID;

   }
   
   int getID()
   {
       return this.bookId;
   }
   
   void setname(String name)
   {
       this.Booktitle=name;

   }
   
   String getname()
   {
       return this.Booktitle;
   }
   
   void setRating(int rating)
   {
       this. bookrating=rating;

   }
   
   int getRating()
   {
       return this.bookrating;
   }

     void displayInfo()
   {
      System.out.println("BookId: "+this.bookId+"\nBooktitle: "+Booktitle+"\nbookrating: "+bookrating);
   
   }}
     
     class BooktitleComparator implements Comparator<Books1> 
     {
         @Override
         public int compare(Books1 o1,Books1 o2)
{
         return o1.Booktitle.compareToIgnoreCase(o2.Booktitle);
         
}
     }


class bookratingComparator implements Comparator<Books1> 
{
@Override
public int compare(Books1 o1,Books1 o2)
{
        
if(o1.bookrating==o2.bookrating)
return 0;
else if(o1.bookrating<o2.bookrating)
return 1;
else
    
    return -1;
}
}

    
   
