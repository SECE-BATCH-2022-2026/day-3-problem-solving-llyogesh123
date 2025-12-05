import java.util.*;
class Triplet
{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
		 	a[i]=sc.nextInt();
		 }
		 Map<Integer,Integer>m=new HashMap<>();
		 for(int i:a)
		 {
		 	m.put(i,m.getOrDefault(i,0)+1);
		 	
		 }
		 int c=0;
		 for(int i:m.keySet())
		 {
		 	if(m.get(i)>=3)
		 	{
		 		c++;
		 	}
		 }
		 System.out.println(c);
	}
}