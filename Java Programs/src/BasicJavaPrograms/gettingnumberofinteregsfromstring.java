package BasicJavaPrograms;

public class gettingnumberofinteregsfromstring {

	public static void main(String[] args) {
		String s="rajkamal123";
		int digits=0, vowels=0,spchar=0,consonants=0,spaces=0;
		for(int i=0;i<=s.length()-1;i++) {
			
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				digits++;
				
			}
			else if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='U'||ch=='u') {
				vowels++;
			}
			else if(!Character.isLetter(ch)) {
				spchar++;			}
			else if(Character.isWhitespace(ch)) {
				spaces++;
			}
			else {
			consonants++;
		}
		}
		System.out.println("number of integers are:"+digits); 
		System.out.println("number of vowels are:"+vowels);
		System.out.println("number of spachar are:"+spchar);
		System.out.println("number of consonants are:"+consonants);
		System.out.println("number of spaces are:"+spaces);
	}

}
