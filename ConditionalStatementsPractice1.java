
package conditionalstatementspractice1;
import java.util.*;

public class ConditionalStatementsPractice1 {

    public static void main(String[] args) {
       int Year;
       System.out.println("Enter the Year:");
       Scanner sc=new Scanner(System.in);
       Year=sc.nextInt();
       if(Year%4==0)
        {
          if(Year%100==0)
          {
              if(Year%400==0)
              {
                  System.out.println("Leap year");
              }
              //System.out.println("Not a leap year");
              else
              {
                  System.out.println("Not a Leap year");
              }
          }
          else
          {
              System.out.println("Leap year");
          }
        }
        else
          {
                  System.out.println("Not a Leap year");
           }
              
        } 
    }
    

