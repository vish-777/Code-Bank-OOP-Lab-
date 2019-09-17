import java.util.Scanner;

class rowsum implements Runnable
{
	Thread th;
	int row[];	
	int sum=0;

	rowsum(int a[])
	{
		th=new Thread(this);
		row=a;
		th.start();
	}
	
	public void run()
	{
		for(int i=0;i<row.length;i++)
			sum+=row[i];
	}
}

class matrixthread
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		rowsum mt[];
		int arr[][],r,c,i,j,sum[],comsum=0;
		System.out.println("Enter the number of rows and columns:");
		r=in.nextInt();
		c=in.nextInt();
		arr=new int[r][c];
		System.out.println("Enter the elements:");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				arr[i][j]=in.nextInt();
		mt=new rowsum[r];
		for(i=0;i<r;i++)
			mt[i]=new rowsum(arr[i]);
		for(i=0;i<mt.length;i++)
    			try{mt[i].th.join();}
  				catch(InterruptedException e) {} 
		for(i=0;i<r;i++)
			comsum+=mt[i].sum;
		System.out.print("Sum of all elements= "+comsum);
	}
}