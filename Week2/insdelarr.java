import java.util.Scanner;
class insdelarr
{
	public static void insert(int a[],int b[],int ele,int pos)
	{
		int i,j;
		for(i=0;i<pos-1;i++)
			b[i]=a[i];
		b[i]=ele;
		for(++i;i<b.length;i++)
		b[i]=a[i-1];
	}
	public static void delete(int a[],int c[],int pos)
	{
		int i,j;
		for(i=0,j=0;i<a.length;i++,j++)
		{
			if(i==pos-1)
			{j--;continue;}
			c[j]=a[i];
		}
	}

	public static void disp(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(+arr[i]+"\t");
	}
	public static void main(String[] args)
	{
		int i,n,ele,pos;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("\nThe array is:");
		insdelarr.disp(a);
		System.out.print("\n\nEnter the element to insert:");
		ele=in.nextInt();
		System.out.print("Enter the position to insert:");
		pos=in.nextInt();
		insdelarr.insert(a,b,ele,pos);
		a=b;
		System.out.println("Array after insertion of element:");
		insdelarr.disp(a);
		int c[]=new int[a.length-1];
		System.out.print("\n\nEnter the position to delete:");
		pos=in.nextInt();
		insdelarr.delete(a,c,pos);
		a=c;
		System.out.println("Array after deletion of element:");
		insdelarr.disp(a);			
	}
}			
		
		
