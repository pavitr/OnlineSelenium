package JavaPrograms;

public class StringSplits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String str=new String("16/09/1996");
	   String arr[]=str.split("/");
	   for(String temp: arr)
	   {
		   System.out.println(temp);
	   }

	}

}
