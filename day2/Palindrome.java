package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int n= 34343;
		
		int temp=0,rev;
		
		for (int i=n;i!=0;i=i/10) {
		
			rev=i%10;
			temp=(temp*10)+rev; 
		}
		
		if(temp==n) {
				
				System.out.println(n+ " is a Palindrome");
			}
		
			else {
				System.out.println(n+ " is not a Palindrome");
			}
			
		}

	}
