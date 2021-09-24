
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A
EF
IJK
MNOP*/
		char ch='A';
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(ch);
				}
				ch++;
				
			}
		
			System.out.println("");
		}

	}
}


