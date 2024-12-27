package operators;

public class o1 {

	public static void main(String[] args) {
		// arithmetic operators: +,-*,/
		// comparision operators: <,>,<=,>=,==,!=
		// assignment operators:  +=,-=,*=,/=
		//conditional operator/ternary operator   :   condition ? true: false
		//logical operator:  and , or, not
		
		int a=40;
		System.out.println(a);
		// add 10 to a
		//System.out.println(a+=10);
		//sub 2 from a
		//System.out.println(a-=2);
		// multiply a by 5
		//System.out.println(a*=5);
		//divide a by 2
		System.out.println(a/=2);
		
		int age=3;
		//                 cond   ?  true  :  false 
		System.out.println(age>18 ? "Major": "Minor");
		/*
		 * 
		 * and :  &&
		 * 
		 * cond1    cond2    result
		 * 
		 * true      true     true
		 * true      false    false
		 * false     true     false
		 * false     false    false
		 * 
		 * 
		 * or :  ||
		 * 
		 * cond1    cond2    result
		 * 
		 * true      true     true
		 * true      false    true
		 * false     true     true
		 * false     false    false
		 * 
		 * 
		 * not :   !
		 * 
		 * true =>false
		 * false => true
		 * 
* */
		
		int m=30;
		int n=3;
		System.out.println("And");
		System.out.println(m<50  &&  n>0);
		System.out.println(m<50 && n==0);
		System.out.println(m==0 && n>0);
		System.out.println(m==0 && n==0);
		System.out.println();
		System.out.println("OR");
		System.out.println(m<50  ||  n>0);
		System.out.println(m<50 || n==0);
		System.out.println(m==0 || n>0);
		System.out.println(m==0 || n==0);
		System.out.println("Not");
		System.out.println(m==30);
		System.out.println(m!=30);
		

	}

}
