
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1111
0000
1111
0000
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i % 2);
			}
			System.out.println("");
		}
	}

}
