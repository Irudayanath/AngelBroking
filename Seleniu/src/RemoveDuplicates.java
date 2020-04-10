import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
public static void main(String args[])
{
	int a[]= {1,2,4,4,4,2,5,3,5,7,5,7,56,8,56};
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		hs.add(a[i]);
		
	}
Iterator<Integer> it=hs.iterator();
while(it.hasNext())
{
	Integer s3=it.next();
	System.out.println(s3);
}
}
}
