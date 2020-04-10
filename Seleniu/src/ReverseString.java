import java.util.Arrays;

public class ReverseString {
	public Boolean ispalindrome(String str)
	{
	int i=0;int j=str.length()-1;
	if(!(str.charAt(i)==str.charAt(j)))
	{
System.out.print("Not palindrome");	

	}
	else
		
	{
		System.out.print("IS PALINDROME");
	}
	return true;
	}
public static void main(String args[])
{
	String s="tamil";
	String s1[]=s.split(" ");
	char s2[]=s.toCharArray();
	for(int i=s2.length-1;i>=0;i--)
	{
		System.out.println(s2[i]);
    }
	ReverseString r=new ReverseString();
	r.ispalindrome(s);
//palindrome
	
}}

