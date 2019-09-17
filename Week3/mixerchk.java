import java.util.Scanner;
class Mixer
{
	static Scanner in=new Scanner(System.in);
	int arr[],n;
	public boolean Search(int x)
	{ 
		for(int i=0;i<arr.length;i++)
    			if(arr[i]==x)
      				return true;
  		return false;
	} 
	public void accept()
	{
		int x;
		System.out.print("Enter the number of elements:");
		n=in.nextInt();
		arr=new int[n];
		System.out.println("Enter the array elements in ascending order without repetion:");
		for(int i=0;i<n;i++)
		{
			x=in.nextInt();
       			if(i>0 && x<arr[i-1])
         		{ 
				System.out.println("Not ascending\nEnter value again");
           			i--;
          		}
       			else if(Search(x))
          		{
				System.out.println("Repeated\nEnter value again");
           			i--;
          		}
           		else 
				arr[i]=x;
    	 	}
			
	}
	public Mixer mix(Mixer A)
	{
		Mixer c=new Mixer();
		int i,j,k;
		c.n=n+A.n;
		c.arr=new int[arr.length+A.arr.length];
		for(i=0,j=0,k=0;i<n && j<A.n;k++)
		{
			if(arr[i]<A.arr[j])
				c.arr[k]=arr[i++];
			else
				c.arr[k]=A.arr[j++];
		}
		if(i>=n)
    			for(;j<A.n;j++,k++)
         			c.arr[k]=A.arr[j];
  		else 
      			for(;i<n;i++,k++)
         			c.arr[k]=arr[i];
		return c;
	}
	public void display()
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
	}
}
class mixerchk
{
	public static void main(String[] args)
	{
		Mixer a,b,c;
		a=new Mixer();
		b=new Mixer();
		System.out.println("First array:");
		a.accept();
		System.out.println("Second array:");
		b.accept();
		c=a.mix(b);
		System.out.println("\nArray 1:");
		a.display();
		System.out.println("\nArray 2:");
		b.display();
		System.out.println("\nMerged array:");
		c.display();
	}
}				
