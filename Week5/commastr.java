import java.util.Scanner;
import java.util.*;
class commastr
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String n,s,t;
		int i;
		System.out.print("Enter the number: ");
		n=in.nextLine();
		if(s.length<4)
			s=n;
		else
		{
			n.getChars(x-3,x,arr,0);
			for(i=x-3;i>=3;i-=3)
			{ 
				n.getChars(i-3,i,arr,0);
				t=new String(arr);
    				s=t+","+s; 
   			}
  			if(i>0)
   			s=","+s;
			for(i-=1;i>=0;i--)
	    		s=n.charAt(i)+s;
		}
		System.out.println("New String: "+s);
	}
}




