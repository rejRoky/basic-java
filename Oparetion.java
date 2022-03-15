import java.lang.*;
import java.util.Scanner;

import javax.swing.text.Style;

class Oparetion 
{
	public static void main (String arg [])
	{
		int aa = 10; 
		int bb = 3;

		float cc = (float) aa/bb;
		int r = aa%bb;

		System.out.println(cc);
		System.out.println(r);

		float  m = 10.25f , n = 3.3f; 
	

		float o = m/n;
		float p = m%n;

		System.out.println(o);
		System.out.println(p);


		byte b = 10;	////
		short s = 20;	////	int
		int i = 40;		////    Type
		char c =10; 	////

		long l = 323l;

		float f = 32.33f;
		double d = 325.3665;


		double x = f / d;    /// take larger size datatype
		System.out.println(x);   

		int y = c+i;		/// take larger size datatype
		System.out.println(y);


		System.out.println((10+20)/3);


		/// Calculate Area of Triangle 

		float baseOfTriangle ;
		float HeightOfTriangle;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base of Triangle: ");
		baseOfTriangle = sc.nextFloat();
		System.out.println("Enter Hight of Triangle: ");
		HeightOfTriangle = sc.nextFloat();

		float areaOfTriangle = (1f/2f)*baseOfTriangle*HeightOfTriangle;
		System.out.println("Area Of Triangle: "+ areaOfTriangle);

		//-------------------------------------------------------------------------
		// 
		// Increment and Decrement Operators
		//
		int X = 10;
		int Y;

		Y= X++; // Assign X value to Y first, then X will increment
		System.out.println("Y is : "+Y);
		System.out.println("X is : "+X);

		
		X=10;
		Y= ++X; // Assign X value to Y first, then X will increment
		System.out.println("Y is : "+Y);
		System.out.println("X is : "+X);




		





	}
}
