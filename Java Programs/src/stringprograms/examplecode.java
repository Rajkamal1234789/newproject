package stringprograms;

public class examplecode {

	public static void main(String[] args) {
		
		
		String raj="rajkamal789";
		
//		String[]words=raj.split("7");
//		System.out.println(words[0]);
//		System.out.println(words[1]);
		
		for(int i=0;i<=raj.length()-1;i++) {
			
			char ch=raj.charAt(i);
			if(Character.isLetter(ch)) {
				System.out.print(ch);
			}
		}
	}

}
