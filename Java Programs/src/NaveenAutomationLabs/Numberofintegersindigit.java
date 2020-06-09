package NaveenAutomationLabs;

public class Numberofintegersindigit {

	public static void main(String[] args) {
		
		int n=37867848;
		int count=0;
		while(n>0) {
			n=n/10;
			++count;
		}
		System.out.println(count);

	}

}
