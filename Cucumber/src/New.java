
public class New {
	public class A
	{
		public void a()
		{
			Integer a=10;
			Character ch='w';
            int b=30;
			System.out.print(a);
			System.out.print(ch);
			System.out.print(b);
			
		}
	}
public class B extends A
{
	public void a() 
	{
		int a=20;
		Integer b=30;
		char c='e';
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}
}
public class c extends B
{
	public void m()
	{
		Character ch='w';
		
	}
}

public static void main(String argsp[])
{
	New n=new New();
	A a=n.new A();
	B b=n.new B();
	a.a();
	b.a();
	
}

}
