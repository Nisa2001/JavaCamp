package javaCamp;

public class LargestNumber {

	public static void main(String[] args) {
	int	number1=23;
	int number2=87;
	int number3=34;
	
	if(number1>number2&&number1>number3) {
		System.out.println("largest number: "+number1);
	}
	else if(number2>number1&&number2>number3) {
		System.out.println("largest number: "+number2);
	}
	else if(number3>number2&&number3>number1) {
		System.out.println("largest number: "+number3);
	}
	else {
		System.out.println("all numbers are equal");
	}
		

	}

}
