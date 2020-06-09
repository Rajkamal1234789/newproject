package BasicJavaPrograms;

public class stringggg {

	public static void main(String[] args) {
		
		String s= "rajkamal mamidala";
		
		String revstring="";
		String[]words=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String rev="";
			String first=words[i];
			for(int j=first.length()-1;j>=0;j--) {
				rev=rev+first.charAt(j);
			}
			revstring=revstring+" " +rev;
			
		}
		System.out.print(revstring);

	}

}
