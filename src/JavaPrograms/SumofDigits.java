package JavaPrograms;

import java.util.Scanner;

public class SumofDigits {
	public static void main(final String[] args) {
        int sum = 0;
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        for (int n = in.nextInt(); n != 0; n /= 10) {
            final int rem = n % 10;
            sum += rem;
        }
        System.out.println("sum" + sum);
    }

}
