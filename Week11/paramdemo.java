import java.awt.*;
import java.applet.*;

/*<applet code="paramdemo" width=100 height=50>
 * <param name=digit value=5>
 * </applet>*/
 
public class paramdemo extends Applet
{
	int num;
	public void init()
	{
		num=Integer.parseInt(getParameter("digit"));
	}
	public void paint(Graphics g)
	{
		for(int i=1,j=15;i<11;i++,j+=15)
		g.drawString(num+" * "+i+" = "+num*i,20,j);
	}
}
		
