package week1day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String s="";
		String[] a=test.split(" ");
		for (int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				for (int j=a[i].length()-1;j>=0;j--)
				{
					char c=a[i].charAt(j);
					s= s+c;
				}
			a[i]=s;
			s ="";
			}
	}
		for (int k=0;k<a.length;k++)		
		{
			System.out.print(a[k] + " ");
		}
		
}
}