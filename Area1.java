import java.lang.*;
import java.util.Scanner;
public class Area1
{
     public static void main(String[] args) 
     {
        
	int a,b,c;
	double area;
	float s;
	System.out.println(" Enter the 3 sides of triangle:");

	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();

	s=(a+b+c)/2;
	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("area of triange "+area);
	
     
     }
}
