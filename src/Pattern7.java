
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*0101
0101
0101
0101 */
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j%2==0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
		System.out.println("");
		}


	}

}
