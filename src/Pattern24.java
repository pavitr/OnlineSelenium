
public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
A
AB
ABC
ABCD*/
	
		for(int i=1;i<=4;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch);
				ch++;
				
			}
		
			System.out.println("");
		}
	}

}
