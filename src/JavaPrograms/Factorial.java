package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
        final Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        for (int n = in.nextInt(), i = 1; i <= n; ++i) {
            fact *= i;
        }
        System.out.println("Factorial=" + fact);
	}

}
