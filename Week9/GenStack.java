import java.util.Scanner;
interface IGen<T>
{
	void push(T i);
	void pop();
}

class Gen<T> implements IGen<T>
{
	int top;
	T stack[];
	Gen(T ref[])
	{
		top=-1;
		stack=ref;
	}
	public void push(T i)
	{
		if(top==stack.length-1)
			System.out.println("\nStack Overflow");
		else
			stack[++top]=i;
	}
	public void pop()
	{
		if(top<0)
			System.out.println("\nStack Underflow");
		else			
			System.out.println("\nPopped "+stack[top--]);
	}
	public void disp()
	{
		System.out.println("\nThe stack elements are:");
		for(int i=0;i<=top;i++)
			System.out.println(stack[i]+"\t");
	}
}

class Student
{
	String name;
	int id;
	Student(String a,int b)
	{
		name=a;
		id=b;
	}
	public String toString()
	{ return ("Name: "+name+"\tID: "+id); }
}

class Employee
{
	String name;
	int empid;
	Employee(String a,int b)
	{
		name=a;
		empid=b;
	}
	public String toString()
	{ return ("Employee Name: "+name+"\tEmployee ID: "+empid); }
}



class GenStack
{
	public static void main(String[] args)
	{
		int n,ch,cho;
		Scanner in=new Scanner(System.in);
		do
		{
			System.out.print("\n\n1.Student\n2.Employee\nAny other key to exit\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
			{
				Student s[]=new Student[10];
				Gen<Student>iob=new Gen<>(s);
				do
				{
					System.out.print("\n1.Push\n2.Pop\n3.Display\nAny other key to exit\nEnter your choice:");
					cho=in.nextInt();
					if(cho==1)
					{
						System.out.print("\nEnter student's name:");
						in.nextLine();
						String a=in.nextLine();
						System.out.print("Enter student's ID:");
						int b=in.nextInt();
						Student temp=new Student(a,b);
						iob.push(temp);
					}
					else if(cho==2)
						iob.pop();
					else if(cho==3)
						iob.disp();
				}while(cho>0 && cho<4);
						
			}
			else if(ch==2)
			{
				Employee e[]=new Employee[10];
				Gen<Employee>iob=new Gen<>(e);
				do
				{
					System.out.print("\n1.Push\n2.Pop\n3.Display\nAny other key to exit\nEnter your choice:");
					cho=in.nextInt();
					if(cho==1)
					{
						System.out.print("\nEnter employee's name:");
						in.nextLine();
						String a=in.nextLine();
						System.out.print("Enter employee ID:");
						int b=in.nextInt();
						Employee temp=new Employee(a,b);
						iob.push(temp);
					}
					else if(cho==2)
						iob.pop();
					else if(cho==3)
						iob.disp();
				}while(cho>0 && cho<4);
			}	
		}while(ch>0 && ch<3);
	}
}