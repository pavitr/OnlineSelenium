
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10CD
10CD
10CD
10CD*/
		
	
		for(int i=1; i<=4; i++)
		{
			char ch='A';
			for(int j=1; j<=4;j++)
			{
				if(j<3)
				{
					System.out.print(ch%2);
				}
				else
				{
					System.out.print(ch);
				}
				ch++;
			}
			System.out.println("");
		}
				

	}

}
