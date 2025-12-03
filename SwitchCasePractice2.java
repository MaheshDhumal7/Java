
package switchcasepractice2;
import java.util.*;

public class SwitchCasePractice2 {

    public static void main(String[] args) {
        String add,sub,mult,div;
        int a,b;
        String option;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mult");
        System.out.println("Div");
        System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();  //It is given because new line is occupied by enter an option
        System.out.println("enter an option in words");
        option=sc.nextLine();
        switch(option)
        {
            case "add":System.out.println("sum is:"+(a+b));
                break;
            case "sub":System.out.println("Difference is:"+(a-b));
                break;
            case "mult":System.out.println("Product is:"+(a*b));
                break;
            case "div":System.out.println("Ratio is:"+(a/b));
                break;
            default :System.out.println("invalid option");
        }
        
        
    }
    
}
