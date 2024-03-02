import java.lang.*;
import java.util.Scanner;
public class Bitwise
{
	public static void main(String args[])
	{
		//To store two numbers in 8 bits
		byte a=10,b=5;
		byte c;
		c=(byte)(b<<4);
		c=(byte)(a|c);
		System.out.println(c);
		//To print left 4 bits
		System.out.println((c&0b11110000)>>4);
		//To print right 4 bits
		System.out.println((c&0b00001111));		

		//swapping = application of bitwise operator(XOR)
		/*byte a=9,b=12;
		a=(byte)(a^b);
		b=(byte)(a^b);
		a=(byte)(a^b);
		System.out.println(a+" "+b);*/
		
	}
}