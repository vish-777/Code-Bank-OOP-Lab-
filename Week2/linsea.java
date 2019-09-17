import java.util.Scanner;
class linsea
{
	public static int search(int a[],int ele)
	{
		for(int i=0;i<a.length;i++)
			if(a[i]==ele)
				return i+1;
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,i,pos,ele;
		System.out.print("Enter the number of elements:");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();		
		System.out.println("The array is:");
		for(i=0;i<a.length;i++)
			System.out.print(+a[i]+"\t");
		System.out.print("\nEnter the element to search:");
		ele=in.nextInt();
		pos=search(a,ele);
		if(pos<0)
			System.out.println("Element doesnt exist");
		else
			System.out.println("Element is in position: "+pos);
	}
}
