
public class Stocks {
public static void main(String args[])
{
	int a[]= {7,1,5,3,6,4};
	int a1=0;
	int a2=0;
	int p=0;
	for(int i=0;i<a.length;i++)
	{
		a1=Math.min(a[i], a[i+1]);
		a2=Math.max(a[i], a[i+1]);
	}
	
	p=a2-a1;
    System.out.print(p);

}
}
