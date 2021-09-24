package JavaPrograms;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Scanner in = new Scanner(System.in);
	        System.out.println("Enetr number");
	        final int n = in.nextInt();
	        if (n % 2 == 0) {
	            System.out.println("Even Number");
	        }
	        else {
	            System.out.println("Its an odd number");
	        }

	}

}
