
public class Leetcode {
public static void main(String args[])
{
	int a[]= {7,5,6,4,3,2,1};
	int g=0;
	int s=0;
	for(int i=0;i<a.length-1;i++)
	{
		g=Math.max(a[i],0);
		System.out.println("Max"+g);
		s=Math.min(a[i++],g);
		System.out.println("Min"+s);
		
	}
	int p=g-s;
	System.out.println("Profit"+ p);
			
}
}
