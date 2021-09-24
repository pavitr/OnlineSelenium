package JavaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner in = new Scanner(System.in);
        System.out.println("enter the year");
        final int year = in.nextInt();
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap yaer");
        }
    

	}

}
