
package conditionalstatementspractice3;
import java.util.*;

public class ConditionalStatementsPractice3 {
    public static void main(String[] args) {
        String url;
        System.out.println("Enter a URL");
        Scanner sc=new Scanner(System.in);
        url=sc.nextLine();
        int a=url.indexOf(":");
        String Protocol=url.substring(0,a);
        int b=url.lastIndexOf(".");
        String Website=url.substring(b+1,url.length());
        
        if(Protocol.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(Protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        
        if(Website.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(Website.equals("net"))
        {
            System.out.println("Network");
        }
        else if(Protocol.equals("org"))
        {
            System.out.println("Organisation");
        }
    }
    
}
