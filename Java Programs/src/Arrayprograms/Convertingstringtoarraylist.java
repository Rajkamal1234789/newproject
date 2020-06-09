package Arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Convertingstringtoarraylist {
//		//converting arrat to arraylist
//	public static void main(String[] args) {
//		String[]array= {"rajkamal","mamidala"};
//		ArrayList<String>list=new ArrayList<String>(Arrays.asList(array));
//		System.out.println(list);
//		
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("raj");
		list.add("kamal");
		list.add("vijay");
		list.add("prathibbha");
		String[]a=new String[list.size()];
		list.toArray(a);
		for(String b:a) {
			System.out.println(b);
		}
		
	}

}
