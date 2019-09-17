import java.util.Scanner;
class Stack
{
	int s[],tos;
	Stack(int size)
 	{
  		s=new int[size];
		tos=-1;
 	}
 
 	void push(int item)
 	{
		if(tos==s.length-1)
			System.out.println("Stack is full");
 		else
     			s[++tos]=item;
 	}
 
	int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underflow");
			return 0;
  		}
  		return s[tos--];
 	}
	void disp()
	{
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+"\t");
	}
	void sort()
	{
		int i,j,temp;
		for(i=0;i<s.length;i++)
			for(j=0;j<s.length-i-1;j++)
				if(s[j]>s[j+1])
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
	}
}
class Teststack
{
	public static void main (String[] args)
 	{
		int n,i;
  		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the Stack:");
		n=in.nextInt();
		Stack st=new Stack(n);
		System.out.println("Enter the stack elements:");
		for(i=0;i<st.s.length;i++)
		{
			n=in.nextInt();
			st.push(n);
		}
		System.out.println("The stack is:");
		st.disp();
		System.out.println("\nSorted stack is:");
		st.sort();
		st.disp();
	}
}

  
 
      
