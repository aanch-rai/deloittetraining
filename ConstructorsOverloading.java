
public class ConstructorsOverloading
{
	private int CustID;
	private String CustName;
	private int billAmount;
	
	
	
			
	public String getCustName() {
	
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public int getCustID() {
		return CustID;
	}

	public ConstructorsOverloading()
	{
		CustID=1;
		CustName = "NA";
		billAmount = 12430;
		// TODO Auto-generated constructor stub
	}
	
	public ConstructorsOverloading(int cid, int bill)
	{
		billAmount=100;
		CustID = cid;
	}
	
	public ConstructorsOverloading(int cid, String Cname )
	{	this();
		CustID = cid;
		CustName = Cname;
	}
	
	public void Display()
	{
		System.out.println("The client name ="+CustName);
		System.out.println("The client ID ="+CustID);
		System.out.println("The client amt ="+billAmount);
		
	}
	
	public static void main(String[] args)
	{
		ConstructorsOverloading obj = new ConstructorsOverloading(5,"lolo");
		ConstructorsOverloading obj2 = new ConstructorsOverloading(5,"lila");
		
		obj.Display();
		obj2.Display();
	
	}
}
