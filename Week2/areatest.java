import java.util.Scanner;
class Figure
{
	abstract int area(int d1,int d2);
}
class Rectangle extends Figure
{
	int area(int d1,int d2)
	{
		return d1*d2;
	}
}
class Triangle extends Figure
{
	float area(int d1,int d2)
	{
		return (float)0.5*d1*d2;
	}
}
class Square extends Figure
{
	int area(int d1,int d2)
	{
		return d1*d2;
	}
}
class areatest
{
	public static void main(String args[])
	{
		
