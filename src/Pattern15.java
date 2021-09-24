
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * DCBA
DCBA
DCBA
DCBA
		 */

		for (int i = 1; i <= 4; i++) {
			char ch = 'D';
			for (int j = 1; j <= 4; j++) {
				System.out.print(ch);

				ch--;
			}

			System.out.println("");
		}
	}

}
