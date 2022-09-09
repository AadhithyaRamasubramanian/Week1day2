package week1day1;

public class OddindextoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "changeme";
		for (int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				char d=s.charAt(i);
				char a=Character.toUpperCase(d);
				System.out.println(a);
		}
	
	else
	{
		char b=s.charAt(i);
		System.out.println(b);
		
	}	
			}	
		

}
}