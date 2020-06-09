package NaveenAutomationLabs;

public class Reversofastringg {

	public static void main(String[] args) {
		
		String s="rajkamal mamidala";
		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
String revstring=" ";
		String[]words= s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String v=words[i];
			String rev=" ";
			for(int j=v.length()-1;j>=0;j--) {
				rev=rev+v.charAt(i);
			}
			revstring=revstring+rev;
		}
	System.out.println(revstring);
		
	}

}
