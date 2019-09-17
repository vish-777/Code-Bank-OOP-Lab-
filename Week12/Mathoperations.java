import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code="Mathoperations" width=300 height=300>
</applet>*/
public class Mathoperations extends JApplet
{
	JLabel sum,product,difference,quotient;
	JButton comp=new JButton("Compute");
	JTextField jtf1,jtf2;
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run()
				{
					makeGUI();
				}
			});
		}
		catch(Exception e)
		{System.out.println(e);}	
	}
	
	private void makeGUI()
	{
		setLayout(new FlowLayout());
		jtf1=new JTextField(15);
		jtf2=new JTextField(15);
		add(jtf1);
		add(jtf2);
		sum=new JLabel("SUM=",JLabel.CENTER);
		product=new JLabel("PRODUCT=",JLabel.CENTER);
		difference=new JLabel("DIFFERENCE=",JLabel.CENTER);
		quotient=new JLabel("QUOTIENT=");
		add(comp);
		add(sum);
		add(product);
		add(difference);
		add(quotient);
		comp.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		float a=Float.parseFloat(jtf1.getText());
		float b=Float.parseFloat(jtf2.getText());
		sum.setText("SUM="+(a+b));
		difference.setText("DIFFERENCE="+(a-b));
		product.setText("PRODUCT="+(a*b));
		quotient.setText("QUOTIENT="+(a/b));
		}
		});
	}
}