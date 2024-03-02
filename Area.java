import java.lang.*;
import java.util.Scanner;
public class Area
{
     public static void main(String[] args) 
     {
        /*int height =4;
        int base=5;
        int area =(base*height)/2;
        System.out.println(area);*/

	float base,height,area;
	System.out.println(" Enter the height and breadth :");

	Scanner sc=new Scanner(System.in);
	base =sc.nextFloat();
	height =sc.nextFloat();

	area=base*height/2;
	System.out.println("area of triange "+area);
	
     
     }
}
