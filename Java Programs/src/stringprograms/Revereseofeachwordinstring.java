package stringprograms;

public class Revereseofeachwordinstring {

	public static void main(String[] args) {
		String s="rajkamal mamidala kamalhasan movie";
		String revstring="";
		String [] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
				
			}
			revstring=revstring+" " +revword;
		}
		System.out.println(revstring);
		
		
		

	}

}
