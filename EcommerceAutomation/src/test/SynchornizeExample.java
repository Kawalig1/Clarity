package test;

public class SynchornizeExample 
{
	//int x = 10;
	public synchronized void test(int x)
	{
		//x = 1+x;
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		SynchornizeExample s = new SynchornizeExample();
		SynchornizeExample s1 = new SynchornizeExample();
		s.test(15);
		s1.test(20);
		

	}

}
