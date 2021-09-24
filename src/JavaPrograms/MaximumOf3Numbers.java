package JavaPrograms;

import java.util.Scanner;

public class MaximumOf3Numbers {
	public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("a");
        final int a = in.nextInt();
        System.out.println("b");
        final int b = in.nextInt();
        System.out.println("c");
        final int c = in.nextInt();
        if (a > b && a > c) {
            System.out.println("Value of a is greater" + a);
        }
        else if (b > c && b > a) {
            System.out.println("Value of b is greater" + b);
        }
        else {
            System.out.println("Value of c is greater" + c);
        }
    }

}
