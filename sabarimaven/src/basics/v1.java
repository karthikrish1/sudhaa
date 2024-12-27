package basics;



public class v1 {

	public static void main(String[] args) {
		/*
		 * variable : name given to a memory location
		 * syntax for variable declaration:  datatype variablename= value;
		 * 
		 * word:   String
		 * letter: char
		 * number:  int, double, float
		 *      
		 *          decimal: double, float
		 *          double: store upto 16 digits after decimal point
		 *          float: store upto 8 digits after decimal point, add f at the end
		 *          
		 *true/false: boolean 
		 * 
		 * 
		 * 
		 * datatype variablename= value;
		 * */
		
		String n="dhivya";
		char initial='k';
		int age=30;
		double height=1.23;
		float weight=34.5f;
		boolean result=true;
		
		System.out.println("Name is "+ n);
		System.out.println("Initial is "+ initial);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("REsult is "+ result);
		
		//addition, sub, mult, div
		
		int a=40;
		int b=2;
		System.out.println("Addition is "+ (a+b));
		System.out.println("Substraction is "+ (a-b));
		System.out.println("Product is "+ a*b);
		System.out.println("division is "+ a/b);
		
		//area of square : side*side
		//perimter of square: 4*side
		// area of rectangle : l*b
		// perimter of rect  : 2*(l+b)
		// area of triangle : 0.5*base*height
		// perimeter of circle: 2*3.14*r
		
		double r=2.3;
		System.out.println("Area of circle is "+ 3.14*r*r);
		
		int side=4;
		System.out.println("Area of square is "+ side*side);
	}

}
