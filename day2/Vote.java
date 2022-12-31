package week1.day2;

public class Vote {

	public static void main(String[] args) {
		int age=27;
		if(age<18) {
			System.out.println("Your age is "+age+" so you are not eligible to vote." );
		}
		else if (age>=18) {
			System.out.println("Your age is "+age+" so you are eligible to vote.");
		}

	}

}
