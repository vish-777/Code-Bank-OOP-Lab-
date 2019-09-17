import java.awt.*;
import java.applet.*;
/*<applet code="Q1" width=300 height=50></applet> */

public class Q1 extends Applet{
	
	public void init()
	{
		setBackground(Color.red);
		
                
	}
	
	public void paint(Graphics g)
	{  
		
		g.drawString("Welcome to applet programming",10,20);
		showStatus("This is status window");
	}
} 
