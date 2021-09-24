package JavaPrograms;

import java.util.Scanner;

public class String_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1,s2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first string");
		s1=in.nextLine();
		System.out.println("Enter the Second string");
		s2=in.nextLine();
		boolean b=(s1.contentEquals(s2));
		
		if(b==true)
		{
			System.out.println("both strings are same");
		}
		else
		{
			System.out.println("Both strings are not same");
		}
	}

}
