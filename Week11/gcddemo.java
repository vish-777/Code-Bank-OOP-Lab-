import java.awt.*;
import java.applet.*;
/*<applet code="gcddemo" width=500 height=500>
 * <param name=x value=10>
 * <param name=y value=20>
 * </applet>*/
 public class gcddemo extends Applet
 {
	 int a,b;
	 public void init()
	 {
		 a=Integer.parseInt(getParameter("x"));
		 b=Integer.parseInt(getParameter("y"));
	 }
	 public void paint(Graphics g)
	 {
		 int gcd=1;
		 for(int i=2;i<=a&&i<=b;i++)
			if(a%i==0 && b%i==0)
				gcd=i;
		 g.drawString("GCD of "+a+" & "+b+" = "+gcd,50,50);
	 }
}
