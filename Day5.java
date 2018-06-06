
package day5;

/**
 *
 * @author Foram
 * final class can not be inherited. final method cant be overwritten.final variable cant change it value.
 * all the variable in an interface are by default final.
 */
public class Day5 {

    public static void main(String[] args) {
        
        TestA object = new TestA();
        object.display();
       // object.show();
        object.output();
        int x = object.number;
        System.out.println("x : " + x);
        
       // object.number=20;
        
        
    }
}
