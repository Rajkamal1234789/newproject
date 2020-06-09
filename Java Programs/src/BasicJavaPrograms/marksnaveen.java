package BasicJavaPrograms;

import java.util.*;

public class marksnaveen {
	
	public String grades(int marks) {
		String grade="";
		if(marks>=91&&marks<=100) {
			grade="AA";
			System.out.println("Accoding to marks ,grade is:"+grade);
		}
			
		else if(marks>=81&&marks<=90) {
			grade="AB";
			System.out.println("According to marks ,grade is:"+grade);
		}
		else if(marks>=71&&marks<=80) {
			grade="BB";
			System.out.println("According to marks ,grade is:"+grade);
		}
		else if(marks>=61&&marks<=70) {
			grade="BC";
			System.out.println("According to marks ,grade is:"+grade);
		}
		else if(marks>=51&&marks<=60) {
			grade="CD";
			System.out.println("According to marks ,grade is:"+grade);
		}
		else if(marks>=41&&marks<=50) {
			grade="DD";
			System.out.println("According to marks ,grade is:"+grade);
		}
		else if(marks<=40) {
			grade="Fail";
			System.out.println("According to marks ,grade is:"+grade);
		}
		else {
			System.out.println("entered marks are not appropriate");
		}
		return grade;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int marks;
		System.out.println("enter your marks");
		
		marks=sc.nextInt();
		
		marksnaveen t=new marksnaveen();
		t.grades(marks);
		

	}

}
