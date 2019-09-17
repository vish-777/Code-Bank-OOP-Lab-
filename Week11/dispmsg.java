import java.awt.*;
import java.applet.*;
/*<applet code="dispmsg" width=300 height=50></applet>*/
public class dispmsg extends Applet
{
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.cyan);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet programming",20,20);
		showStatus("This is status window");
	}
}
