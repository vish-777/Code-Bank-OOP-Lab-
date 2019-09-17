import java.util.Scanner;
class Date
{
	int day,month,year;
	Date(int a,int b,int c)
	{
		day=a;
		month=b;
		year=c;
	}
	boolean leap()
	{
		int flag=0;
		if(year%4==0)
			flag=1;
		if(year%100==0)
			flag=0;
		if(year%400==0)
			flag=1;	
		if(flag==1)
			return true;
		return false;
	}
	int daysSinceJan1()
	{
		int days=0,i;
		for(i=1;i<month;i++)
		{
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
				days+=31;
			else if(i==2)
			{
				days+=28;
				if(leap());
				days++;
			}
			else 
				days+=30;
		}
		days+=day;
		return days;
	}
}
class DateDemo
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Date d;
		int a,b,c;
		System.out.print("Enter day:");
		a=in.nextInt();	
		System.out.print("Enter month:");
		b=in.nextInt();	
		System.out.print("Enter year:");
		c=in.nextInt();	
		d=new Date(a,b,c);
		System.out.println("Total days from Jan1= "+d.daysSinceJan1());
	}
}
			
