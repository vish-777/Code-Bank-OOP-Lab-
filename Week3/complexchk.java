import java.util.Scanner;
class Complex
{
	float re,im;
	public void init(float a,float b)
	{
		re=a;
		im=b;
	}
	public void disp()
	{
		System.out.println("("+re+") + ("+im+")i");
	}
	public Complex add(Complex q)
	{
		Complex sum=new Complex();
		sum.re=re+q.re;
		sum.im=im+q.im;
		return sum;
	}
	public Complex subtract(Complex q)
	{
		Complex diff=new Complex();
		diff.re=re-q.re;
		diff.im=im-q.im;
		return diff;
	}
}
class complexchk
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Complex a,b,sum,diff;
		a=new Complex();
		b=new Complex();
		float re,im;
		System.out.println("Enter real & imaginary values for 1st number:");
		re=in.nextFloat();
		im=in.nextFloat();
		a.init(re,im);
		System.out.println("Enter real & imaginary values for 2nd number:");
		re=in.nextFloat();
		im=in.nextFloat();
		b.init(re,im);
		System.out.print("\n1st complex number: ");
		a.disp();
		System.out.print("\n2nd complex number: ");
		b.disp();
		sum=a.add(b);
		diff=a.subtract(b);
		System.out.print("\nSum= ");
		sum.disp();
		System.out.print("\nDifference= ");
		diff.disp();
	}
}
		
