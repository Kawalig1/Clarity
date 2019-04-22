package test;

public class EncapsulationExample 
{
	private int account_no;
	private String Bank_name;

	

	public int getAccount_no() {
		System.out.println(account_no);
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getBank_name() {
		System.out.println(Bank_name);
		return Bank_name;
	}

	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	
	public static void main(String[] args) 
	{
		EncapsulationExample EE = new EncapsulationExample();
		
		EE.setAccount_no(123456);
		EE.getAccount_no();
		
		EE.setBank_name("Citi Bank");
		EE.getBank_name();
		
		

	}

}
