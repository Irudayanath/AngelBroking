
public class SumofStrings {
	public String getSum(String num1,String num2)
	{
		int i=Integer.parseInt(num1);
		int j=Integer.parseInt(num2);
		int k=i+j;
		String m=Integer.toString(k);
		return m;
		
	}
	//without using IntegerParse

	public String m(String num1,String num2)
	{
		StringBuilder sb=new StringBuilder();

		int n1=num1.length()-1;
		int n2=num2.length()-1;
		int carry=0;
		System.out.println("length of String " +n1);
		if(n1>0||n2>0||carry>0)
		{
			int toadd=carry;
			if(n1>0)
			{
				toadd+=num1.charAt(n1)-'0';
				n1--;
			}
			if(n2>0)
			{
				toadd+=num2.charAt(n2)-'0';
				n2--;
			}
			carry=toadd/10;
			toadd%=10;
			sb.append(toadd);
		}
		return sb.reverse().toString();
		
	}
public static void main(String args[])
{
	
	SumofStrings s=new SumofStrings();
	System.out.println(s.getSum("100","340"));
	System.out.print(s.m("tamil","char"));
}
}



