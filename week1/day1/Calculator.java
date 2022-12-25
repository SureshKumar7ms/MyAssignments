package week1.day1;

public class Calculator {
	
	//Addition
	//Two methods
	
	//one method with 2 args
	public void addtwoNumbers() {
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	
	}
	//one method with three args
	public int addthreeNumbers(int a,int b,int c) {
		
		return a+b+c;

	}
	
	//Multiplication
	//Two methods
	
	//one method with 1 int args 1 double args
	public static void multiplytwoNumbers1() {
		int a =6;
		double b =12;
		System.out.println(a*b);
	
	}
	
	//one method with 2 int args
	public static int multiplytwoNum2(int a,int b) {
		return a*b;
		
	}
	
	//Subtraction
	//Two methods
	
	//one method with 2 double args
	public static void subtracttwoNum1() {
		double a =12;
		double b =10;
		System.out.println(a-b);
	}
	
	//one method with 2 int args
	public static int subtracttwoNum2(int a,int b) {
		return a-b;
	}
	
	//Division
	//Two methods
	
	//one method with 1 double args and 1 int args 
	public static void dividetwoNum1() {
		double a = 25;
		int b = 10;
		System.out.println(a%b);
	}
	
	//one method with 2 int args
	public static int dividetwoNum2(int a,int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		//Add two numbers
		cl.addtwoNumbers();
		//Add three numbers
		System.out.println(cl.addthreeNumbers(5, 10, 15));
		//Multiply two numbers1
		cl.multiplytwoNumbers1();
		//Multiply two numbers2
		System.out.println(cl.multiplytwoNum2(8, 6));
		//Sub two numbers1
		cl.subtracttwoNum1();
		//Sub two numbers2
		System.out.println(cl.subtracttwoNum2(8,3));
		//Div two numbers1
		cl.dividetwoNum1();
		//Div two numbers2
		System.out.println(cl.dividetwoNum2(8, 4));
				
		

	}

	
}