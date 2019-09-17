import java.util.Scanner;
class symmetric
{
	public static int chksym(int a[][])
	{
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
				if(a[i][j]!=a[j][i])
					return 0;
		return 1;
	}
	public static void main(String[] args)
	{
		int n,i,j,flag;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the matrix:");
		n=in.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the matrix elements:");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=in.nextInt();
		System.out.println("\nThe matrix is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(+a[i][j]+"\t");
			System.out.println("  ");
		}
		flag=chksym(a);
		if(flag==0)
			System.out.println("Matrix isnt symmetric");
		else
			System.out.println("Matrix is symmetric");
	}
}
