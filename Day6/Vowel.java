import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=UserMainCode.count(s);
		System.out.println(c);
	}
}
class UserMainCode
{
	public static int count(String s)
	{
		int c=0;
		String a[]=s.split("");
		for(int i=0;i<a.length;i++)
		{
			String ab=a[i].toLowerCase();
			if(ab.equals("a")||ab.equals("e")||ab.equals("i")||ab.equals("o")||ab.equals("u"))
			{
				c++;
			}
		}
		return c;
	}
}