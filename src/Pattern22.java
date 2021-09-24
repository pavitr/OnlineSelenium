
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ABCD
1234
ABCD
1234
		 */
		for(int i=1;i<=4;i++)
		{
			char ch='A';
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==3)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(j);
				}
				ch++;
				
			}
			System.out.println("");
		}
	}

}
