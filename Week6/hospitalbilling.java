import java.util.Scanner;
import java.util.*;
class Patient
{
	private String name;
	private int age;
	private int hno;
	Patient(String a,int b,int c)
	{
		name=a;
		age=b;
		hno=c;
	}
	void disp()
	{
		System.out.println("\nPatient Name: "+name+"\nAge: "+age+"\nHospital number:"+hno);
	}
}
class InPatient extends Patient
{
	private String dptname;
	protected GregorianCalendar admnd;
	protected int rt;
	InPatient(String a,int b,int c,String d,GregorianCalendar e,int f)
	{
		super(a,b,c);
		dptname=d;
		admnd=e;
		rt=f;
	}
	void disp()
	{
		super.disp();
		System.out.println("Department name: "+dptname+"\nAdmission Date: "+(admnd.get(Calendar.DATE))+"/"+(admnd.get(Calendar.MONTH)+1)+"/"+(admnd.get(Calendar.YEAR)));
		if(rt==1)
			System.out.println("Room Type: Special");
		else if(rt==2)
			System.out.println("Room Type: SemiSpecial");
		else if(rt==3)
			System.out.println("Room Type: General");
	}
}
class Billing extends InPatient
{
	private GregorianCalendar disd;
	Billing(String a,int b,int c,String d,GregorianCalendar e,int f,GregorianCalendar g)
	{
		super(a,b,c,d,e,f);
		disd=g;
	}
	void disp()
	{
		super.disp();
		System.out.println("Discharge Date: "+(disd.get(Calendar.DATE))+"/"+(disd.get(Calendar.MONTH)+1)+"/"+(disd.get(Calendar.YEAR)));
		double days=(double)(disd.getTimeInMillis()-admnd.getTimeInMillis())/1000/60/60/24;
		if(rt==1)
			System.out.println("Total Cost="+(days*1200));
		else if(rt==2)
			System.out.println("Total Cost="+(days*600));
		else if(rt==3)
			System.out.println("Total Cost="+(days*150));
		
	}
}
class hospitalbilling
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Billing bill;
		System.out.print("Enter patient name:");
		String a=in.nextLine();
		System.out.print("Enter age:");
		int b=in.nextInt();
		System.out.print("Enter hospital number:");
		int c=in.nextInt();
		System.out.print("Enter department name:");
		in.nextLine();
		String d=in.nextLine();
		System.out.println("Enter date of admission(DD/MM/YYYY):");
		int w=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		GregorianCalendar e=new GregorianCalendar(y,x-1,w);
		System.out.print("1.Special: Cost/day=1200\n2.Semispecial: Cost/day=600\n3.General: Cost/day=150\nEnter room type:");
		int f=in.nextInt();
		System.out.println("Enter date of discharge(DD/MM/YYYY):");
		w=in.nextInt();
		x=in.nextInt();
		y=in.nextInt();
		GregorianCalendar g=new GregorianCalendar(y,x-1,w);
		bill=new Billing(a,b,c,d,e,f,g);
		bill.disp();
	}
}