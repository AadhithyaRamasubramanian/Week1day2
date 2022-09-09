package week1day2;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text= "We learn java basics as part of java sessions in java week1";
		String[] a=text.split(" ");
	for (int i=0;i<a.length;i++)
	{
		for (int j=0;j<a.length;j++)
	{
	if (a[i].equals(a[j])==true && i!=j)
	{
			a[j]="";
	}			
	}
	}
		for (int i=0;i<a.length;i++)		
		{
			System.out.print(a[i] + " ");
		}
		
	}

}
