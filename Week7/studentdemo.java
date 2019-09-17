import java.util.Scanner;

class SeatsFilledException extends Exception
{
	SeatsFilledException()
	{
		super("Seats full");
	}
	public String toString()
	{
		return "25 is max";
	}
}	

class Student
{
	String name;
	int regno;
	Student(String a,int r) throws SeatsFilledException
	{
		if(r%100>25)
			throw new SeatsFilledException();
		regno=r;
		name=a;
	}
	void disp()
	{
		System.out.println("Name:"+name+"\t Registration number:"+regno);
	}
}

class studentdemo
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,c,ch,i=0;
		Student s[]=new Student[30];
		String b;
		do
		{
			System.out.print("1.Insert record\nAny other key to exit insertion\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
			{
				try
				{
					System.out.println("Enter name:");
					in.nextLine();
					b=in.nextLine();
					System.out.println("Enter year of joining:");
					a=in.nextInt();
					System.out.println("Enter roll no:");
					c=in.nextInt();
					s[i]=new Student(b,(a%100)*1000+c);
					i++;
				}
				catch(SeatsFilledException ex)
				{
					System.out.println(ex);
				}
			}
		}while(ch==1);
		System.out.println("\nThe records are:");
		for(int j=0;j<i;j++)
			s[j].disp();
	}
}