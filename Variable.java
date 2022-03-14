import java.lang.*;

class Variable
{
	public static void main (String arg [])
	{
		byte a  = 127; 

		short d  = 20; 
		int b  = 13; 

		float c  = 200.244f; 
		double e = 2000.245; 

		char x = 'A';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(x);

	/*
	Naming Rules
	-------------------------------------------
	// 1. Case Sensitive */
	int number;
	float Number;
	
	// 2. Contains Alphabets, Numbers, _ or $
	int room_number;
	float total$Amont;
	
	// 3. Start With Alphabet, _ or $
	int _x;
	int room1;
	
	// 4. Should not be a keyword
	/// new,this,case,else 

	// 5. Should not be a class name, if class is also in use
	/// int string;

	// 6. No limit on lenght of name
	/// Meaningful

	// 7. Follow Camel Cases
	int rollNumber;
	float averageMarkOfClass;


	// Literals 
	int value = 20; // 20 is a literals ; Int Literals (byte,int,short)
	double area = 3.1415; // // any decimal vale  is a double literals in java ; Double literals
	char m = 'A'; //  A is a literals ; character Literals
	String str = "Java" ;  // String is class ; str is reference ; "Java" is object  

	int number1 = 10;
	int number2 = 0b1010;	
	int number3 = 012;
	int number4 = 0xA;

	System.out.println(number1);
	System.out.println(number2);
	System.out.println(number3);
	System.out.println(number4);

	long amount = 999_999_999; // _ can use to good visible big number
	System.out.println(amount);

	//conv 
	int n1 = 7 ;
	int n2 = -7 ;
	System.out.println();
	System.out.println(Integer.toBinaryString(n1));
	System.out.println(Integer.toBinaryString(n2));

	// print bangla from unicode charts 
	for (char i = 0x0980; i <= 0x09FF; i++)
		System.out.print(i);


	}
}
