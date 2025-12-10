import java.util.*;
class RegularExpression
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(UserMainCode.regularExpression(s));
	}
}
class UserMainCode
{
	public static boolean regularExpression(String s)
	{
		return s.matches("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
	}
}