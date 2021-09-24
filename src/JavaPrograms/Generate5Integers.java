package JavaPrograms;

public class Generate5Integers
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 5; ++i) {
            System.out.println((int)(Math.random() * 80.0));
        }
    }
}