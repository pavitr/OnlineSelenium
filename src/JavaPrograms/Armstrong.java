package JavaPrograms;

public class Armstrong {
	public static void main(final String[] args) {
        int n = 153;
        int sum = 0;
        final int copy = n;
        while (n != 0) {
            final int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if (sum == copy) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }}
}
