
public class Lastchar {
public static void main(String args[])
{
	String s="welcome to java world where";
	String[] s1=s.split("\\s");
	for(int i=0;i<s1.length;i++)
	{
		String s2=s1[i];
		String s3=s2.substring(s2.length()-1);
		System.out.print(s3);
	}
	
	

}
}
