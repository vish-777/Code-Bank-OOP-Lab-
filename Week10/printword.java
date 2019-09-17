import java.io.*;
import java.util.*;
import java.lang.*;
class printword
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the word to search:");
		String str,str2;
		str=in.nextLine();
		try
		{
			FileInputStream fin=new FileInputStream("fileNames.txt");
			str2=fin.readLine();
			int i=0;
			while(str2!=null)
			{
				i++;
				if(str2.contains(str))
					System.out.println(i+" "+str);
				str2=fin.readLine();
			}
		}
		finally
		{inp.close();}
	}
}
