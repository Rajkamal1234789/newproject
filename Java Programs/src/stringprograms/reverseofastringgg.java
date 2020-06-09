package stringprograms;

public class reverseofastringgg {

	public static void main(String[] args) {
		String reverse=" ",revstring=" ";
		String rev=" ";
		String s="rajkamal mamidala kamalhasan movie";
//		for(int i=s.length()-1;i>=0;i--) {
//			 rev=rev+s.charAt(i);
//			
//		}
//		System.out.print(rev);
//	}
		String[]words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String newword=words[i];
			for(int j=newword.length()-1;j>=0;j--) {
			 reverse=reverse+newword.charAt(j);
				
			}
			revstring=revstring+"" +reverse;
					}
		System.out.println(revstring);
	
}
}
