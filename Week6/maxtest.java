import java.util.Scanner;
import mypackages.p1.Max;
class maxtest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int ch;
		do
		{
			System.out.print("\n1.Largest of 3 integer numbers\n2.Largest of 3 floating point numbers\n3.Largest element in 1D array\n4.Largest element in a matrix\nAny other key for exit\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
			{
				int a,b,c;
				System.out.println("\nEnter 3 integer numbers:");
				a=in.nextInt();
				b=in.nextInt();
				c=in.nextInt();
				System.out.println("Largest integer number="+Max.max(a,b,c));
			}
			if(ch==2)
			{
				float w,x,y;
				System.out.println("\nEnter 3 floating point numbers:");
				w=in.nextFloat();
				x=in.nextFloat();
				y=in.nextFloat();
				System.out.println("Largest floating point number="+Max.max(w,x,y));
			}
			if(ch==3)
			{
				System.out.print("\nEnter the number of elements of the array:");
				int n=in.nextInt();
				int ar[]=new int[n];
				System.out.println("Enter the elements of the array:");
				for(int i=0;i<n;i++)
					ar[i]=in.nextInt();
				System.out.println("Largest element in the array="+Max.max(ar));
			}
			if(ch==4)
			{
				System.out.println("\nEnter the number of rows and columns of the matrix:");
				int r=in.nextInt();
				int c=in.nextInt();
				int arr[][]=new int[r][c];
				System.out.println("Enter the elements of the matrix:");
				for(int i=0;i<r;i++)
					for(int j=0;j<c;j++)
						arr[i][j]=in.nextInt();
				System.out.println("Largest element in the matrix="+Max.max(arr));
			}
		}while(ch>0 && ch<5);
	}
}