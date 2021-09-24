package JavaPrograms;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter num");
        for (int n = in.nextInt(), i = 0; i <= n; ++i) {
            temp += i;
        }
        System.out.println("Total Sum" + temp);

	}

}
