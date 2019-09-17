import java.util.Scanner;
interface Stack
{
	void push(int ele);
	void pop();
}
class Fixed_Stack implements Stack
{
	int stack[],top,n;
	Fixed_Stack(int a)
	{
		top=-1;
		n=a;
		stack=new int[n];
	}
	public void push(int ele)
	{
		if(top==n-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top]=ele;
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println(stack[top--]+" popped");
	}
}
class Dynamic_Stack implements Stack
{
	int stack[],top,n;
       	Dynamic_Stack(int a)
	{
		top=-1;
		n=a;
		stack=new int[n];
	}
	public void push(int ele)
	{
		if(top==n-1)
		{
			n*=2;
			int temp[];
			temp=new int[n];
			for(int i=0;i<stack.length;i++)
				temp[i]=stack[i];
			stack=temp;	
		}
		stack[++top]=ele;
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println(stack[top--]+" popped");
	}
}
class stackimplementation
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int cho,ch;
		Stack s;
		do
		{
			System.out.print("\n1.Fixed Stack\n2.Dynamic Stack\nAny other ket to exit\nEnter your choice:");
			cho=in.nextInt();
			if(cho==1)
			{
				Fixed_Stack f;
				System.out.print("Enter the number of elements:");
				int n=in.nextInt();
				f=new Fixed_Stack(n);
				s=f;
				do
				{
					System.out.print("\n1.Push\n2.Pop\nAny other key to go back\nEnter your choice:");
					ch=in.nextInt();
					if(ch==1)
					{
						System.out.print("\nEnter the element:");
						int e=in.nextInt();
						s.push(e);
					}
					else if(ch==2)
						s.pop();
				}while(ch>0 && ch<3);

			}
			else if(cho==2)
			{
				Dynamic_Stack d;
				d=new Dynamic_Stack(5);
				s=d;
				do
				{
					System.out.print("\n1.Push\n2.Pop\nAny other key to go back\nEnter your choice:");
					ch=in.nextInt();
					if(ch==1)
					{
						System.out.print("\nEnter the element:");
						int e=in.nextInt();
						s.push(e);
					}
					else if(ch==2)
						s.pop();
				}while(ch>0 && ch<3);	
			}
		}while(cho>0 && cho<3);	
	}
}