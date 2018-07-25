//remove the word synchronized in method printSomething to understand how threads are not  safe
//By using the word 'synchronized', it becomes thread safe.

package day7;

class Print
{
	public synchronized static void printSomething(String firstName, String lastname)
	{
		System.out.println("Welcome, "+ firstName);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Bye, "+ lastname);

	}
}


public class multithreads extends Thread
{	private String firstname;
	private String lastname;

	
	public multithreads(int id, String firstname, String lastname) {
		super(id + "");
		this.firstname= firstname;
		this.lastname = lastname;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Print.printSomething(firstname, lastname);
	}

	
	public static void main(String[] args)
	{
		new multithreads(1,"Rahul","Mehta");
		new multithreads(2,"Pooja","Agarwal");
		new multithreads(3,"Nidhi","Singh");
		
		
	}
}



