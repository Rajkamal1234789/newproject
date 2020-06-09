package NaveenAutomationLabs;

public class powerofnumber {

	public static void main(String[] args) {
		
		//2^4=16
		
		
		int base=2;
		int exponent=4;
		long result=1;
		while(exponent>0) {
			result*=base;
			--exponent;
		}
		System.out.println(result);

	}

}
