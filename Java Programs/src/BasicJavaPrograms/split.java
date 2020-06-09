package BasicJavaPrograms;

public class split {

	public static void main(String[] args) {
		String s="rajkamall456";
		for(int i=0;i<=s.length()-1;i++) {
			char ch= s.charAt(i);
			//if(Character.isLetter(ch)) {
			//	System.out.print(ch);
			//}
			
//			if(Character.isDigit(ch)) {
//				System.out.print(ch);
//			}
			
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				System.out.print(ch);
			}
		}

	}

}
