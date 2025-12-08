import java.util.*;
import java.util.regex.*;
class UserMaincode
{
	public static boolean check(String s)
	{
		String a="^[CPT]{3}-\\d{6}$";
		return s.matches(a);
	}
}
public class Regex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean res=UserMaincode.check(s);
		System.out.println(res ? "True" : "False");
	}
}