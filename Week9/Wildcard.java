import java.util.Scanner;
import java.lang.Math;
class NumericFnss<T extends Number>
{
	T num;
	NumericFnss(T a)
	{num=a;}
    boolean absEqual(NumericFnss iob)
	{
		if(Math.abs(num.doubleValue())==Math.abs(iob.num.doubleValue()))
			return true;
		return false;
	}
}

class WildCard
{
	public static void main(String[] args)
	{	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		Double n1=in.nextDouble();
		Double n2=in.nextDouble();
		NumericFnss<Double>nd1=new NumericFnss<Double>(n1);
		NumericFnss<Double>nd2=new NumericFnss<Double>(n2);
		if(nd1.absEqual(nd2))
			System.out.println("Absolute values of the numbers are same");
		else	
			System.out.println("Absolute values of the numbers are not same");
	}
}