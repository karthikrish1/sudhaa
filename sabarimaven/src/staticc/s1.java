package staticc;

public class s1 {
public static void main(String[] args) {
	s1.area();
	s1.add();
	
	//public: average of three numbers
	//private: area of rectangle 
	
	
	
}

// anywhre inside the project 
public static void area()
{
	int s=3;
	System.out.println("Area of square is "+ s*s);
	}

//only within the class 
private static void add()
{
	int a=3;
	int b=10;
	int c=20;
	System.out.println("Addition is "+ (a+b+c));}
}
