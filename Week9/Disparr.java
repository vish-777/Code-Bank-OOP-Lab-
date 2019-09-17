import java.util.Scanner;
class display
{
	static <T> void disp(T arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
}

class Disparr
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of array elements:");
		int n=in.nextInt();
		System.out.println("\nInteger demo\nEnter the integer elements:");
		Integer arr1[]=new Integer[n];
		for(int i=0;i<n;i++)
			arr1[i]=in.nextInt();
		display.disp(arr1);
		System.out.println("\n\nFloating point demo\nEnter the floating point elements:");
		Float arr2[]=new Float[n];
		for(int i=0;i<n;i++)
			arr2[i]=in.nextFloat();
		display.disp(arr2);
		System.out.println("\n\nString demo\nEnter the string elements:");
		String arr3[]=new String[n];
		for(int i=0;i<n;i++)
			arr3[i]=in.next();
		display.disp(arr3);
	}
}