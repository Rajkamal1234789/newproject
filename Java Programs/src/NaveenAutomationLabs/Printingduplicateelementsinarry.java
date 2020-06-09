package NaveenAutomationLabs;

public class Printingduplicateelementsinarry {

	public static void main(String[] args) {
		
		int[]k= {6,3,4,5,6,7,8,3,4,5,7,8};
		
		for(int i=0;i<=k.length-1;i++) {
			
			for(int j=i+1;j<=k.length-1;j++) {
				if(k[i]==k[j]) {
					System.out.println(k[i]);
				}
			}
			
		}

	}

}
