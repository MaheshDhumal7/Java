
package conditionalstatementspractice;
import java.util.*;

public class ConditionalStatementsPractice {

    public static void main(String[] args) {
        String num;
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextLine();
        if(num.matches("[01]+"))
        {
               System.out.println("Binary number and radix is 2");
        }
        else if(num.matches("[0-7]+"))
        {
               System.out.println("octal number and radix is 8");
        }
        else if(num.matches("[0-9]+"))
        {
               System.out.println("Decimal number and radix is 10");
        }
        else if(num.matches("[A-F0-9]+"))
        {
               System.out.println("HexaDecimal number and radix is 16");
        }
        else
        {
               System.out.println("Invalid number");
        }
        
    }
    
}
