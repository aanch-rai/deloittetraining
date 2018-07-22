Question:
Interface Account is extended by (interface)LoanAcc and (interface)DepositAcc
Interface Interest is extended by (interface)CreditInterest and (interface)DebitInterest




Create a package called bank with the following Interfaces.

 
Interface> Account
Data members: Four String variables to hold the account type “Savings, Fixed,  
                          PersonalLoan,HousingLoan”
Methods:  createAcc()
					
 <Interface>DepositAcc
Methods:  withdraw (), deposit (),getBalance()
 <Interface>LoanAcc
Methods:  repayPrincipal (),payInterest (),payPartialPrincipal () 
<Interface>Interest
Data members:  Four double variables to hold the interest percentage of Savings 
                          account, Fixed deposit account, PersonalLoan account and         
                           HousingLoan account.
Methods:  calcInt()
<Interface>CreditInterest
Methods:  addMonthlyInt(),addHalfYrlyInt(),addAnnualInt()
 <Interface>DebitInterest
Methods:  deductMonthlyInt(),deductHalfYrlyInt(),deductAnnualInt()
Create a package called BankImpl and create the following classes in it.
 
1.	SavingsAcc which implements DepositAcc  and CreditInterest
2.	FDAcc which implements DepositAcc  and CreditInterest
3.	PersonalLoanAcc which implements LoanAcc and DebitInterest
4.	HousingLoanAcc which implements LoanAcc and DebitInterest
 
Now create a class called MyAccount and create instances of all the accounts 
and generate appropriate output.
