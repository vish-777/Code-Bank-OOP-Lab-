import java.util.Scanner;
class NumericFns<T extends Number>
{
	T num;
	NumericFns(T a)
	{num=a;}
	double reciprocal()
	{ return 1/num.doubleValue(); }
	double fraction()
	{ return num.doubleValue()-num.intValue(); }
}

class BoundsDemo
{
	public static void main(String[] args)
	{	
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number:");
		Double n=in.nextDouble();
		NumericFns<Double>nd=new NumericFns<Double>(n);
		System.out.println("\nReciprocal= "+nd.reciprocal()+"\nFraction part= "+nd.fraction());
	}
}
