import java.util.Scanner;
interface Series
{
	int getNext();
	void reset(int n);
	void setStart(int n);
}
class ByTwos implements Series
{
	int start;
	public int getNext()
	{
		start+=2;
		return start;
	}
	public void reset(int n)
	{start=n;}
	public void setStart(int n)
	{start=n;}
}
class seriesimplementation
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the start value:");
		int n,ch;
		ByTwos bt;
		bt=new ByTwos();
		Series s;
		s=bt;
		n=in.nextInt();
		s.reset(n);
		do
		{
			System.out.print("\n1.Next number\n2.Reset value\n3.Start from a new value\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
				System.out.print("\nNext number= "+s.getNext());
			else if(ch==2)
				s.reset(n);
			else if(ch==3)
			{
				System.out.println("Enter the new starting number: ");
				n=in.nextInt();
				s.reset(n);
			}
		}while(ch>0 && ch<4);
	}
}
			
	
