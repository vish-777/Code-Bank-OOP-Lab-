import java.io.*;
import java.util.*;
public class directory
{
 
	public static void disp(File path)
	{
	    if(path.isFile())
	    System.out.println(path.getName());    
	    else
	    {
	        System.out.println(path.getName());
	        File files[]=path.listFiles();
	        for(File dir:files)
	        disp(dir);
	    }	
	}
 
	public static void main(String args[])
	{	
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter path :");
	    String path=in.nextLine();
	    File f=new File(path);
	    disp(f);
	}
}
