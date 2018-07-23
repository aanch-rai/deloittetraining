
public class CustomerList implements Comparable<CustomerList>
{
	private int customerId;
	private int billAmount;
	private String customerName;
	private String customerAddress;
	
	
	public int compareTo(CustomerList o)
	{	
		/*//sorting customer based on customer id
		if(this.customerId>o.customerId)
			return 1;
		else
			return -1;
	*/
		
		if((this.getCustomerName().compareTo(o.getCustomerName()))>0)
		{
			return 1;
		}
		else
		{	return -1;} 
	}
	
	
	@Override
	public String toString() {
		return "CustomerList [customerId=" + customerId + ", billAmount=" + billAmount + ", customerName="
				+ customerName + ", customerAddress=" + customerAddress + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public CustomerList(int customerId, int billAmount, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.billAmount = billAmount;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

}


