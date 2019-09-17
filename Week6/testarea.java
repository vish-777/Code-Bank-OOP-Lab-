import java.util.Scanner;
abstract class Figure
{
	abstract void area(int a,int b);
}
class Rectangle extends Figure
{
	void area(int a,int b)
	{
		System.out.println("Area= "+(a*b));
	}
}
class Triangle extends Figure
{
	void area(int a,int b)
	{
		System.out.println("Area= "+(a*b*0.5));
	}
}
class Square extends Figure
{
	void area(int a,int b)
	{
		System.out.println("Area= "+(a*b));
	}
}
class testarea
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int ch;
		do
		{
			Figure f;
			System.out.print("\nCalculating Areas\n1.Rectangle\n2.Triangle\n3.Square\nAny other key to exit\nEnter your choice:");
			ch=in.nextInt();
			if(ch==1)
			{
				Rectangle r;
				r=new Rectangle();
				f=r;
				System.out.println("\nEnter the two sides:");
				int a=in.nextInt();
				int b=in.nextInt();
				f.area(a,b);
			}
			if(ch==2)
			{
				Triangle t;
				t= new Triangle();
				f=t;
				System.out.print("\nEnter the height:");
				int a=in.nextInt();
				System.out.print("Enter the base:");
				int b=in.nextInt();
				f.area(a,b);
			}
			if(ch==3)
			{
				Square s;
				s= new Square();
				f=s;
				System.out.print("\nEnter the side:");
				int a=in.nextInt();
				f.area(a,a);
			}
		}while(ch>0 && ch<4);
	}
}