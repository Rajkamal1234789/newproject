package stringprograms;

import java.util.StringTokenizer;

public class secondwaytofindnumberofwordsinastring {

	public static void main(String[] args) {
		
		String raj= "ghfj gydg jhf kk jkfhk vbhdks bghf hbsj hjsbj";
		
		
//		
//		String[] words=raj.split(" ");
//		
//		System.out.println(words.length);
		
		
		StringTokenizer tokens=new StringTokenizer(raj);
		System.out.println(tokens.countTokens());

	}

}
