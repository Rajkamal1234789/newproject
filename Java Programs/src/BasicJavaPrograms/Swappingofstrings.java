package BasicJavaPrograms;

public class Swappingofstrings {

	public static void main(String[] args) {
		String a="rajkamak mamidala kamal hasan fgjgd djkjfsk fhshkj shkhskh ashdjhs asdjsk";
		String[]words=a.split(" ");
		for(int i=words.length-1;i>=0;i--) {
		
		String word=words[i];
		System.out.print(" "+word);

	}
		
}
}
