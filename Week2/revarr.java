import java.util.Scanner;
class revarr
{	
	public static void main(String[] args)
	{
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n=in.nextInt();
                int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("The array is:");
		disp(a);
		System.out.println("\nArray after reversing:");	
		revarr.reverse(a);	
		disp(a);
	}
	public static void disp(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(+a[i]+"\t");
	}
	public static void reverse(int a[])
	{
		int temp,i,j;
		for(i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}	
