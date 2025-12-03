
package switchcasepractice1;
import java.util.*;

public class SwitchCasePractice1 {
    public static void main(String[] args) {
        //Display name of day based on a number
        /*int day;
        System.out.println("Enter a day);
        Scnner sc=new Scanner(System.in);
        day=sc.nextInt();
        switch(day)
        {
            case 1:System.out.println("mon");
                break;
            case 2:System.out.println("tue");
                break;
            case 3:System.out.println("wed");
                break;
            case 4:System.out.println("thu");
                break;
            case 5:System.out.println("fri");
                break;
            case 6:System.out.println("sat");
                break;
            case 7:System.out.println("sun");
                break;
            default :System.out.println("invalid");
                break;
        }*/
        
        //Display name of month based on a number
       /*int month;
        System.out.println("Enter a month);
        Scnner sc=new Scanner(System.in);
        month=sc.nextInt();
        switch(month)
        {
            case 1:System.out.println("jan");
                break;
            case 2:System.out.println("feb");
                break;
            case 3:System.out.println("mar");
                break;
            default :System.out.println("invalid");
                break;
        }*/
        
        //Display type of website
        String url;
        System.out.println("Enter a Url");
        Scanner sc=new Scanner(System.in);
        url=sc.nextLine();
        int a=url.lastIndexOf(".");
        
        String Website=url.substring(a+1);
        
        switch(Website)
        {
            case "org":System.out.println("Organisation");
                break;
            case "net":System.out.println("Network");
                break;
            case "com":System.out.println("Commercial");
                break;
            case "gov":System.out.println("Government");
                 break;
            default:System.out.println("Invalid website");
                break;
        
        }
    }
}
    

