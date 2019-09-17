import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="drawshapes" WIDTH=500 HEIGHT=500>
</applet>*/

public class drawshapes extends JApplet
{
	JButton j1,j2,j3,j4,j5,j6;
	int x,y,p,q;
	String s="";
	public void start()
	{
		setLayout(new FlowLayout());
		j1=new JButton("Rectangle");
		j2=new JButton("Oval");
		j3=new JButton("Arc");
		j4=new JButton("Line");
		j5=new JButton("Round Rectangle");
		j6=new JButton("Polygon");
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		add(j6);
		j1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{s="Rectangle";}
		});
		j2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{s="Oval";}
		});
		j3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{s="Arc";}
		});
		j4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{s="Line";}
		});
		j5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{s="Round Rectangle";}
		});
		j6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{s="Polygon";}
		});
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me)
			{
				x=me.getX();
				y=me.getY();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me)
			{
				p=me.getX();
				q=me.getY();
				repaint();
			}
		});
	}

	public void paint(Graphics g)
	{
		int xp[]={10, 200, 10, 200, 10};
        int yp[]={450, 450, 650, 650, 450};
        super.paint(g);
        if(s=="Rectangle")
        {
        	g.drawRect(x,y,p-x,q-y);
        	g.drawString("Area="+(p-x)*(q-y),10,10);
        }
        else if(s=="Oval")
        	g.drawOval(x,y,p-x,q-y);
        else if(s=="Arc")
        	g.fillArc(x,y,p-x,q-y,0,90);
        else if(s=="Line")
        	g.drawLine(x,y,p,q);
        else if(s=="Round Rectangle")
        	g.drawRoundRect(x,y,p-x,q-y,25,25);
        else if(s=="Polygon")
        	g.drawPolygon(xp,yp,5);
	}
}