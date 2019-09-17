package mypackages.p1;
public class Max
{
	public static int max(int a,int b,int c)
	{
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		return big;
	}
	public static float max(float a,float b,float c)
	{
		float big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		return big;
	}
	public static int max(int a[])
	{
		int big=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>big)
				big=a[i];
		return big;
	}
	public static int max(int a[][])
	{
		int big=a[0][0];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
				if(a[i][j]>big)
					big=a[i][j];
		return big;
	}
}