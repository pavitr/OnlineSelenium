package JavaConcepts;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		System.out.println(a[0]);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
		
	//	initialization of array
		a[0]=30;
		a[1]=31;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
