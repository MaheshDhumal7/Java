
package scpalindrome;

import java.util.Scanner;

public class SCPalindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rev=0,r;
        int m=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
            
        }
        if(rev==m)
        {  System.out.println("Given numnber is palindrome ");
        }
        else{
            System.out.println("Given number is not a palindrome");
        }
    }
    
}
