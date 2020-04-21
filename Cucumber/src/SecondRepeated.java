import java.util.HashSet;
import java.util.Stack;

public class SecondRepeated {
public static void main(String args[])
{
	int a[]= {1,2,3,4,3,5,4,8,9};
	Stack<Integer> st=new Stack<Integer>();
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		if(hs.contains(a[i]))
		{
			st.push(a[i]);
		}
		else
		{
			hs.add(a[i]);
		}
	}
	System.out.print(st.pop());
}
}
