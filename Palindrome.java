package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S= "madam";
		String rev= "";
		for(int i=S.length()-1;i>=0;i--)
		{
			char c=S.charAt(i);
			rev =rev+c;
			
		}
		if(S.equals(rev)==true)
	System.out.println("Palindrome");
		else 
			System.out.println("Not a Palindrome");
	}
	

}
