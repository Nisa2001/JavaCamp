package javaCamp;

public class PerfectNumber {

	public static void main(String[] args) {
		

		// Perfect number is a number whose sum of all positive divisors is equal to itself.
		
		int number=28;
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total=total+i;
			}
		}
			if(total==number) {
				System.out.println("is the perfect number");
			}
			else {
				System.out.println("is not a perfect number");
			
			}
	
	}

}
