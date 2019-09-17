import java.util.Scanner;
class Time
{
	int hh,mm,ss;
	public void init(int a,int b,int c)
	{
		hh=a;
		mm=b;
		ss=c;
	}
	public void disp()
	{
		System.out.println(hh+":"+mm+":"+ss);
	}
	public Time add(Time q)
	{
		int flag=0;
		Time sum=new Time();
		sum.ss=ss+q.ss;
		if(sum.ss>=60)
		{
			sum.ss-=60;
			flag=1;
		}
		sum.mm=mm+q.mm;
		if(flag==1)
		{
			sum.mm++;
			flag=0;
		}
		if(sum.mm>=60)
		{
			sum.mm-=60;
			flag=1;
		}
		sum.hh=hh+q.hh;
		if(flag==1)
			sum.hh++;
		return sum;
	}
	public Time subtract(Time q)
	{
		int flag=0;
		Time diff=new Time();
		if(q.ss>ss)
		{
			flag=1;
			diff.ss=ss-q.ss+60;
		}
		else
			diff.ss=ss-q.ss;
		if(flag==1)
		{
			mm--;
			flag=0;
		}
		if(q.mm>mm)
		{
			diff.mm=mm-q.mm+60;
			flag=1;
		}
		else
			diff.mm=mm-q.mm;
		if(flag==1)
			hh--;
		diff.hh=hh-q.hh;
		return diff;
	}
	public int compare(Time q)
	{
		if(hh>q.hh)
			return 1;
		if(hh==q.hh && mm>q.mm)
			return 1;
		if(hh==q.hh && mm==q.mm && ss>q.ss)
			return 1;
		if(hh==q.hh && mm==q.mm && ss==q.ss)
			return -1;
		return 0;
	}		

}
class timechk
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Time a,b,sum,diff;
		int hh,mm,ss,x;
		a=new Time();
		b=new Time();
		System.out.println("Enter the 1st value of time:(hh:mm:ss)");
		hh=in.nextInt();
		mm=in.nextInt();
		ss=in.nextInt();
		a.init(hh,mm,ss);	
		System.out.println("Enter the 2nd value of time:(hh:mm:ss)");
		hh=in.nextInt();
		mm=in.nextInt();
		ss=in.nextInt();	
		b.init(hh,mm,ss);
		sum=a.add(b);
		System.out.print("\nTime 1:  ");
		a.disp();
		System.out.print("Time 2:  ");
		b.disp();
		x=a.compare(b);
		if(x<0)
		{
			System.out.println("Both times are equal:");
			diff=a.subtract(b);
		}
		else if(x==1)
		 {
			System.out.println("Time 1 is greater than Time 2");
			diff=a.subtract(b);
		}
		else
		{
			System.out.println("Time 2 is greater than Time 1");
			diff=b.subtract(a);
		}
		System.out.println("\nSum of the times is:");
		sum.disp();
		System.out.println("Difference in the times is:");
		diff.disp();		
	}
}
		
