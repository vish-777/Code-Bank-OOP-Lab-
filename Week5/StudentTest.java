import java.util.Scanner;
import java.util.*;
class Student
{
	int regno;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa,cgpa;
	Student()
	{
		regno=0;
		name=" ";
		doj=new GregorianCalendar(2001,1,1);
		sem=0;
		gpa=cgpa=0;
	}
	Student(int a,String b,GregorianCalendar c,short d,float e,float f)
	{
		regno=a;
		name=b;
		doj=c;
		sem=d;
		gpa=e;
		cgpa=f;
	}
	void disp()
	{
		int d,m,y;
		d=doj.get(Calendar.DATE);
		m=doj.get(Calendar.MONTH);
		y=doj.get(Calendar.YEAR);
		System.out.println("\nRegistration number: "+regno+"\nName: "+name);
		System.out.println("Date of Joining: "+d+"/"+m+"/"+y);
		System.out.println("Semester: "+sem+"\nGPA: "+gpa+"\nCGPA: "+cgpa);
	}
	static void sortcgpa(Student arr[])
	{	
		Student temp=new Student();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j].sem<arr[j+1].sem)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j].sem==arr[j+1].sem && arr[j].cgpa<arr[j+1].cgpa)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		
	}
	static void sortname(Student arr[])
	{
		Student temp=new Student();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j].name.compareTo(arr[j+1].name)<0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
	}
	static void dispcharname(Student arr[],char c)
	{
		for(int i=0;i<arr.length;i++)	
			if(arr[i].name.charAt(0)==c)
				arr[i].disp();
	}
	static void substringsrch(Student arr[],String str)
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i].name.indexOf(str)>=0)
				arr[i].disp();
	}
	static void shortename(Student arr[])
	{
		int i,n,n1;
		String snew;
		for(i=0;i<arr.length;i++)
	        {
			snew=null;
			n=arr[i].name.length();
			n1=n;
			n1=arr[i].name.lastIndexOf(" ",n1);
			snew=arr[i].name.substring(n1+1);
			while(n1>0)
			{
				n1=arr[i].name.lastIndexOf(" ",n1-1);
				snew=arr[i].name.charAt(n1+1)+"."+snew;
			}
			arr[i].name=snew;
			arr[i].disp();
		}
	}
			
	
}
class StudentTest
{
	public static void main(String[] args)
	{                                              
		Scanner in=new Scanner(System.in);
		int ch=1;
		int i,n,a,b,c,r;
		short sem;
		float gpa,cgpa;
		GregorianCalendar doj;
		Student s[];
		String str;
		System.out.print("Enter the number of records:");
		n=in.nextInt();
		s=new Student[n];
		System.out.println("Enter all the records:");
 		for(i=0;i<n;i++)
 		{
			System.out.print("\nEnter details of student "+(i+1)+"\nEnter name: ");
			in.nextLine();
			str=in.nextLine();
			System.out.println("Enter date joined (DD/MM/YY):");
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			doj= new GregorianCalendar(c,b,a);
			r=(c%100)*1000+i+1;
			System.out.print("Enter semester:");
			sem=in.nextShort();
			System.out.print("Enter GPA: ");
			gpa=in.nextFloat();
			System.out.print("Enter CGPA: ");
			cgpa=in.nextFloat();
			s[i]=new Student(r,str,doj,sem,gpa,cgpa);				
		}
		while(ch>0 && ch<7)
		{
			System.out.print("\n\n1.Display all records\n2.Display records sem-gpa wise\n3.Display records in alphabetical order\n4.Display records starting with certain character\n5.Display records containing certain substring\n6.Shorten names and display records\nAny other key for exit\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
				for(i=0;i<n;i++)
					s[i].disp();
			if(ch==2)
			{
				System.out.println("\nRecords Sem-GPA wise:");
				Student.sortcgpa(s);
				for(i=0;i<n;i++)
					s[i].disp();
			}
			if(ch==3)
			{
				System.out.println("\nRecords in alphabetical order:");
				Student.sortname(s);
				for(i=0;i<n;i++)
					s[i].disp();
			}
			if(ch==4)
			{
				System.out.print("Enter the character:");
				char C=in.next().charAt(0);
				System.out.println("\nRecords char wise:");
				Student.dispcharname(s,C);
			}
			if(ch==5)
			{
				System.out.print("Enter the substring:");
				in.nextLine();
				String C=in.nextLine();
				System.out.println("\nRecords substring wise:");
				Student.substringsrch(s,C);
			}
			if(ch==6)
			{
				System.out.println("\nRecords after shortening names:");
				Student.shortename(s);
			}
		}
			
	}
}















	
