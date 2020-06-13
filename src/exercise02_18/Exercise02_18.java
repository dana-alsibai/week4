  /*
        Name:  Dana Alsibai
        Assignment:  Revel Book
        Date:  June 13th, 2020
    
        Description:
        (Print a table) Write a program that displays the following table.
         Cast floating-point numbers into integers.
    */

package exercise02_18;

/**
 *
 * @author danasebai
 */
public class Exercise02_18 {

    /**
     * @param args the command line arguments
     */

  public static void main(String [] args){
    int a =1;
    int b =2;
     System.out.print("a \t \t" + "b\t \t" + "Math.pow(a,b)");
    for (int i = 1; i<=5; i++){
      a = i;
      b= i+1;
      System.out.println();
    System.out.println(a  + "\t \t" + b + "\t \t" + (int)Math.pow(a,b));
    }

    }
    
}
