import java.util.Scanner;
class Counter
{
	static int c=0;
	Counter()
	{
		c++;
	}
	static void showCount()
	{
		System.out.println("\nCounter= "+c);
	}
}
class counterchk
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int ch;
		Counter arr[]=new Counter[10];
		do
		{
			System.out.println("\n1.Create object\n2.Show count\n3.Exit\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
			{
				System.out.println("Object is created");
				arr[Counter.c+1]=new Counter();
			}
			else if(ch==2)
				Counter.showCount();
			else
				break;
		}while(ch!=3);	
	}
}
