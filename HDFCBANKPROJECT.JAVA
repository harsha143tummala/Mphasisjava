
import java.util.Scanner;

interface Hdfc
{
	void createAccount();
	void deposit();
	void withdraw();
	void balcheck();
}
	class classbank implements Hdfc
	{
		Scanner ob=new Scanner(System.in);
		int accno;
		String name;
		String address;
		String dob;
		int adhar,balcheck,balance,drawn,amount;
	public void createAccount()
	{
		System.out.println("enter name");
		name=ob.next();
		System.out.println("enter the address of present");
		address=ob.next();
		System.out.println("enter your adhar card no");
		adhar=ob.nextInt();
		System.out.println("enter your dob as per ssc certificate");
		dob=ob.next();
	System.out.println("your new bank account was created\n WELCOME TO HDFC WORLD\n Reach us for support any time");
System.out.println("WELCOME MR. "+name+" from "+address+" you are allocated accno is "+dob+adhar);
	}
	public void deposit()
	{
		System.out.println("Enter the amount to be deposited");
		amount=ob.nextInt();
		System.out.println("the amount deposited into acc ****** is "+amount);
		
	}
	public void withdraw()
	{
		System.out.println("enter the amount of money to be withdrawn");
		drawn=ob.nextInt();
		System.out.println("the amount of money withdrawn from accno ******* is" +drawn);
	}
	public void balcheck()
	{
		System.out.println("enter balance");
		balance=ob.nextInt();
		
		if	(drawn<balance){
			balcheck=(balance-drawn);}
			balcheck=(balance+amount);
		System.out.println("the final balance in acc *** is"+balcheck);
	}
	public static void main(String[] args) {
		classbank ou=new classbank();
		ou.createAccount();
		ou.withdraw();
		ou.deposit();
		ou.balcheck();
	}
}