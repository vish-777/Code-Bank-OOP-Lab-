import java.awt.*;
import java.applet.*;
/*
<applet code="table" width=300 height=300>
<param name=num value=3>


</applet> 
*/
public class table extends Applet{
 int num;  
 public void init()
  { num=Integer.parseInt(getParameter("num"));
  }
 public void paint(Graphics g)
  {  for(int i=1,j=20;i<11;i++,j+=20)
       g.drawString(num+"*"+i+"="+num*i+"\n",20,j);
  }
}