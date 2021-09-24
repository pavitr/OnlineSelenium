package JavaPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner in = new Scanner(System.in);
        System.out.println("enter Number");
        final int n = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        System.out.print(String.valueOf(f1) + " " + f2 + " ");
        for (int i = 1; i <= n; ++i) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(String.valueOf(f3) + " ");
        }

	}

}
