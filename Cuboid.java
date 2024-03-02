import java.lang.*;
import java.util.*;
public class Cuboid
{
	public static void main(String args[])
	{
		//volume of cuboid
		/*int height,breadth,length;
		float volume;
		
		System.out.println("Enter the height,breadth,length :");
		Scanner sc=new Scanner(System.in);
		height=sc.nextInt();
		breadth=sc.nextInt();
		length=sc.nextInt();

		volume=height*breadth*length;
		System.out.println("volume of cuboid:"+volume);*/
		
		// total surface Area of cubolid
		int height,breadth,length;
		float Area;
		
		System.out.println("Enter the height,breadth,length :");
		Scanner sc=new Scanner(System.in);
		height=sc.nextInt();
		breadth=sc.nextInt();
		length=sc.nextInt();
		
		Area=2*(length*breadth +breadth*height+height*length);
		System.out.println("area of cuboid:"+Area);


		

	}
}