import java.util.Scanner;
import java.io.*;
class countinfile
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("fileNames.txt");
			int cc,nc,wc,lc,i;
			cc=nc=wc=lc=0;
			char ch;
			i=fin.read();
			while(i!=-1)
			{
				ch=(char)i;
				if(ch=='.')
				{
					i=fin.read();
					ch=(char)i;
					if(ch=='\n')
						wc++;
					continue;
				}
				if(Character.isLetter(i))
					cc++;
				else if(Character.isDigit(i))
					nc++;
				else if(ch==' ' || ch=='\n')
					wc++;
				if(ch=='\r' || ch=='\n')
					lc++;
				i=fin.read();
			}
			System.out.println("Number of letters: "+cc+"\nNumber of digits: "+nc+"\nNumber of words: "+wc+"\nNumber of lines: "+lc);
			fin.close();
		}
		catch(FileNotFoundException e)
		{e.printStackTrace();}
		catch(IOException e)
		{e.printStackTrace();}
	}
}
					
