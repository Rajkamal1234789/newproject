package BasicJavaPrograms;

public class stic {

	public static void main(String[] args) {
		
		String s ="rajkamal456";
		for (int i=0; i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				System.out.print(ch);
			}
		}

	}

}
