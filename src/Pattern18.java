
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*AAAA
0000
CCCC
0000*/
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 4; j++) {
				if(ch%2!=0)
				{
				System.out.print(ch);
				}
				else
				{
					System.out.print(ch%2);
				}

			}
			ch++;

			System.out.println("");
		}


	}

}
