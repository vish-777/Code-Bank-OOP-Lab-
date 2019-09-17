import java.util.Scanner;
import java.util.*;
class Person
{
	private String name;
	private GregorianCalendar bday;
	Person(String a,GregorianCalendar b)
	{
		name=a;
		bday=b;
	}
	String retname()
	{return name;}
	GregorianCalendar retbday()
	{return bday;};
}
class CollegeGraduate extends Person
{
	private float cgpa;
	private int yog;
	CollegeGraduate(float a,int b,String c,GregorianCalendar d)
	{
		super(c,d);
		cgpa=a;
		yog=b;
	}
	void disp()
	{
		GregorianCalendar bd=retbday();
		int a=bd.get(Calendar.DATE);
		int b=bd.get(Calendar.MONTH);
		int c=bd.get(Calendar.YEAR);
		System.out.println("\nName:"+retname()+"\nDOB:"+a+"/"+b+"/"+c+"\nCGPA: "+cgpa+"\nYear of Graduation: "+yog);
	}	
}
class graduatetest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);	
		CollegeGraduate cg[];
		System.out.print("Enter the number of students:");
		int n=in.nextInt();
		cg=new CollegeGraduate[n];
		System.out.println("Enter the graduate details:");
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter details of Student "+(i+1)+"\nEnter Student name:");
			in.nextLine();
			String name=in.nextLine();
			System.out.println("Enter birth date(DD/MM/YYYY):");
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			GregorianCalendar z=new GregorianCalendar(c,b,a);
			System.out.print("Enter CGPA:");
			float gpa=in.nextFloat();
			System.out.print("Enter year of graduation(YYYY): ");
			int y=in.nextInt();
			cg[i]=new CollegeGraduate(gpa,y,name,z);
		}
		System.out.println("\nThe graduates details are:");
		for(int i=0;i<n;i++)
			cg[i].disp();	
	}
}