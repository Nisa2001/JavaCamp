package javaCamp;

public class PrimeNumber {

	public static void main(String[] args) {
		
	int number=15;
	boolean isPrime=true;
	
	for(int i=2;i<=number;i++) 
	{
		if(number%i==0) {
		
			isPrime=false;
		}	
	}
	
	if(number<2) {
		System.out.println("number is not prime");
		return;
	}
		if(isPrime) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}

}
