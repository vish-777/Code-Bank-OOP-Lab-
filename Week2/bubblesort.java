import java.util.Scanner;
class bubblesort
{
	public static void ascending(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length-1;i++)
			for(j=0;j<a.length-1-i;j++)
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
	}
	public static void descending(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length-1;i++)
			for(j=0;j<a.length-1-i;j++)
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
	}
	public static void main(String[] args)
	{
		int n,i,ch;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("\nThe array is:");
		for(i=0;i<n;i++)
			System.out.print(+a[i]+"\t");
		System.out.println("\nSelect\n1.Ascending\n2.Descending\nEnter your choice:");
		ch=in.nextInt();
		if(ch==1)
		{
			ascending(a);
			System.out.println("\nArray after sorting:");	
			for(i=0;i<n;i++)
				System.out.print(+a[i]+"\t");	
		}
		else
		{
			descending(a);
			System.out.println("\nArray after sorting:");	
			for(i=0;i<n;i++)
				System.out.print(+a[i]+"\t");	
		}
			
	}
}			
