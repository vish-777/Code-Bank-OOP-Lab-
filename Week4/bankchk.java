import java.util.Scanner;
class Bankaccount
{
	String name;
	int accno;
	String type;
	int balance;
	static int roi;
	Bankaccount()
	{
		name="Anonymous";
		accno=00000000000000;
		type="Single";
		balance=0;
	}
	Bankaccount(String a,int b,String c,int d)
	{
		name=a;
		accno=b;
		type=c;
		balance=d;
	}
	void deposit(int a)
	{
		balance+=a;
	}
	void withdraw(int a)	
	{
		if(balance<a)	
			System.out.println("Cant withdraw...Minimum balance required");
		else
		{
			balance-=a;
			System.out.println("Transaction of Rs."+a+" completed");
		}
	}
	void disp()
	{
		System.out.println("\nAccount Details:\nName:"+name+"\nAccount Number: "+accno+"\nAccount Type:"+type+"\nBalance: "+balance);
	}
	static void disproi()
	{
		System.out.println("Rate of Interest: "+roi);
	}	
}
class bankchk
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Bankaccount b;
		String n,t;
		int a,bal,r;
		System.out.print("Enter name:");
		n=in.next();
		System.out.print("Enter account number:");	
		a=in.nextInt();
		System.out.print("Enter the account type:(Joint or Single)");
		t=in.next();
		System.out.print("Enter the balance:");
		bal=in.nextInt();
		System.out.print("Enter the rate of interest:");
		Bankaccount.roi=in.nextInt();
		b=new Bankaccount(n,a,t,bal);
		b.disp();
		System.out.println("\nEnter amount to deposit:");
		a=in.nextInt();
		b.deposit(a);
		b.disp();
		System.out.println("\nEnter amount to withdraw:");
		a=in.nextInt();
		b.withdraw(a);
		b.disp();
		b.disproi();
	}
}


