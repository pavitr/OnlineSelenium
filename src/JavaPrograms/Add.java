package JavaPrograms;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        final int a = in.nextInt();
        System.out.println("Enter the value of b:");
        final int b = in.nextInt();
        final int Sum = a + b;
        System.out.println("Value of Sum" + Sum);

	}

}
