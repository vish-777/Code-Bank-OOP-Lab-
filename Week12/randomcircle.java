import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.text.NumberFormat;
/*<applet code="randomcircle" width=300 height=300>
 * </applet>*/

public class randomcircle extends JApplet
{	
	int x,y,p,q;		
	NumberFormat nf;
	public void init()
	{
		nf=NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
	}
	public void start()
	{
		setLayout(new FlowLayout());
		addMouseListener(new MouseAdapter(){
		public void mousePressed(MouseEvent me)
		{
			x=y=0;
			x=me.getX();
			y=me.getY();
		}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me)
			{
				p=q=0;
				p=me.getX();
				q=me.getY();
				repaint();  
			}
		});
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.red);			
		g.drawOval(x,y,(p-x),(p-x));
		double r=(p-x)/(2*37.81);
		double d=r*2;
		double area=3.14*r*r;
		double circum=2*3.14*r;
		g.drawString("Radius: "+nf.format(r)+" Diameter: "+nf.format(d)+" Area: "+nf.format(area)+" Circumfurence: "+nf.format(circum),10,10);
	}	
}
