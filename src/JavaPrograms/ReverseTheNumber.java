package JavaPrograms;

import java.util.Scanner;

public class ReverseTheNumber {
	 public static void main(final String[] args) {
	        int rem = 0;
	        int rev = 0;
	        final Scanner in = new Scanner(System.in);
	        System.out.println("Enter Number");
	        for (int n = in.nextInt(); n != 0; n /= 10) {
	            rem = n % 10;
	            rev = rev * 10 + rem;
	        }
	        System.out.println("Rev=" + rev);
	    }
}
