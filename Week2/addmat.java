import java.util.Scanner;
class addmat
{
	static Scanner in=new Scanner(System.in);
	public static void dispmat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
				System.out.print(+mat[i][j]+"\t");
			System.out.println("  ");
		}
	}
	public static void accmat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[0].length;j++)
				mat[i][j]=in.nextInt();
	}
	public static void main(String[] args)
	{
		int m,n;
		System.out.println("Enter the number of rows and columns:");
		m=in.nextInt();
		n=in.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		System.out.println("Enter the first matrix:");
		accmat(a);
		System.out.println("Enter the second matrix:");
		accmat(b);
		System.out.println("\nFirst matrix:");
		dispmat(a);
		System.out.println("\nSecond matrix:");
		dispmat(b);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		System.out.println("\nSum of the above matrices:");
		dispmat(c);
	}
}
