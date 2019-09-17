import java.awt.*;
import java.applet.*;

/* <applet code="Banner" width=300 height=50>
   </applet>
*/

public class Banner extends Applet implements Runnable{
String msg="Banner ";
Thread t=null;
int state;
boolean stopFlag;

public void start()
{ t=new Thread(this);
  stopFlag=false;
  t.start();
}
public void run()
{ char ch;
  while(true)
  { try { repaint();
         Thread.sleep(250);
         ch=msg.charAt(0);
         msg=msg.substring(1,msg.length());
         msg+=ch;
         if(stopFlag)
           break;
       }
   catch(InterruptedException e)
       { System.out.println("Exception caught");
       }
  }
}

public void paint(Graphics g)
{ g.drawString(msg,10,20);
}
}