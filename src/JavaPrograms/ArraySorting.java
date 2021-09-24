package JavaPrograms;

public class ArraySorting
{
    public static void main(final String[] args) {
        final int[] arr = { 90, 50, 30, 20, 80 };
        for (int n = arr.length, i = 0; i < n - 1; ++i) {
            for (int j = 1; j < n - i; ++j) {
                if (arr[j - 1] > arr[j]) {
                    final int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(String.valueOf(arr[i]) + " ");
        }
    }
}