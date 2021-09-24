package JavaPrograms;

public class StrongNumber {
	public static void main(final String[] args) {
        int n = 145;
        int sum = 0;
        final int copy = n;
        while (n != 0) {
            int fact = 1;
            int x;
            for (int rem = x = n % 10, i = 1; i <= x; ++i) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == copy) {
            System.out.println("Strong number");
        }
        else {
            System.out.println("it is not a Strong number");
        }
    }

}
