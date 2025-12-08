import java.io.*;
import java.util.*;
class Usermaincode
{
	public static String[] removeduplicate(String[] arr)
	{
		TreeSet<String>s=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		String res[]=new String[s.size()];
		int i=0;
		for(String ans:s)
		{
			res[i++]=ans;
		}
		return res;
	}
}
public class RemoveDuplicates
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
		String []inp=new String[n];
		for(int i=0;i<n;i++)
		{
			inp[i]=br.readLine();
		}
		String res[]=Usermaincode.removeduplicate(inp);
		for(String s:res)
		{
			System.out.println(s);
		}
	}
}