package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 8;
		int sum,a1=0,a2=1;
	
		System.out.println(a1);
		
		System.out.println(a2);
		
		for(int i=2;i<n;i++) {
			
			sum=a1+a2;
			a1=a2;
			a2=sum;
			
		System.out.println(sum);
		
		}

	}

}
