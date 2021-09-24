package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int flag = 0;
	        final Scanner in = new Scanner(System.in);
	        System.out.println("Enetr number");
	        for (int n = in.nextInt(), i = 2; i <= n / 2; ++i) {
	            if (n % i == 0) {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0) {
	            System.out.println("It is a prime number");
	        }
	        else {
	            System.out.println("It is not a prime number");
	        }
	    }



}
