package javaCamp;

public class FindNumbers {

	public static void main(String[] args) {
	
// githuba yüklemeden önce class isimlerini değişir ilk harfi büyük yap
		int [] numbers= new int[] {1,2,3,4,5,6,7,8,9,77,55,44,111};
		int numberCall=4;
		boolean isThere=false;
		
	for(int number:numbers ) {
		if(number==numberCall) {
			isThere=true;
			break;
		}
		
	}
	
	if(isThere) {
		
		System.out.println("available");
	}
	else {
		System.out.println("not available");
	}
	}

}
