package JavaPrograms;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
	        double principal_Amount = 0.0;
	        double interest_Rate = 0.0;
	        double Time_Period = 0.0;
	        double CI = 0.0;
	        final Scanner in = new Scanner(System.in);
	        System.out.println("Principal");
	        principal_Amount = in.nextDouble();
	        System.out.println("Inetrest rate");
	        interest_Rate = in.nextDouble();
	        System.out.println("Time Period");
	        Time_Period = in.nextDouble();
	        CI = principal_Amount * Math.pow(1.0 + interest_Rate / 100.0, Time_Period);
	        System.out.println("CI" + CI);
	    

	}

}
