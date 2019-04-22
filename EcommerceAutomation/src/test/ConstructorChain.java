package test;

public class ConstructorChain {
	
	public String name;
	public int age;
	public String address;
	
	
	/*ConstructorChain()
	{
		this("Gopal");
	}*/
	
	ConstructorChain(String empName)
	{
		this(empName,33,"Mumbai");
	}
	
	ConstructorChain(String empName, int empAge, String empAddress)
	{
		this.name=empName;
		this.age=empAge;
		this.address=empAddress;
		
	}
	
	public void display()
	{
		System.out.println("Name of Employee :: " +name);
		System.out.println("Age of Employee :: " +age);
		System.out.println("Address of Emplyee :: " +address);
	}
	
	public static void main(String arg[])
	{
		ConstructorChain cc = new ConstructorChain("Saish",6,"Kurla");
		
		cc.display();
		
		
	}

}
