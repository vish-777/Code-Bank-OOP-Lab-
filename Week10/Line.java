import java.io.*;
import java.util.Scanner;
class ifprintword
{
	public static void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		FileInputStream In=null;
		String str1,str2
		System.out.print("Enter search word:");
		str1=in.next();
		try
		{
			In=new FileInputStream("fileNames.txt");
			for(int i=0,c=In.read();c!=-1;i++,c=In.read())
			{
				char curr[]=null;
				curr=new char[50];
				int j=0;
				while(c!='\n' && c!=-1 && c!='\r')
      				{  
					curr[j++]=(char)c;
      	  				c=In.read();
				}
     				c=In.read();
				curr[j]='\0';
			        line[i]=new String(curr);
			}    
		}
		finally
		{
			if(In!=null) 
		 	In.close(); 
		}
		for(int i=0;line[i]!=null;i++)
		{
			if(line[i].indexOf(search)!=-1)
			System.out.println("\n"+(i+1)+" "+line[i]);
		}
	}
}
