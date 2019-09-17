import java.util.Scanner;
class Comma{

public static void main(String[] args){

Scanner In=new Scanner(System.in);
System.out.println("Enter string:");
String n=In.next();
String s=null;
char arr[]=new char[3];
int x=n.length();
int i;
String t;
if(x<4)
  s=new String(n);

else 
{ n.getChars(x-3,x,arr,0);
  s=new String(arr);
  for(i=x-3;i>=3;i-=3)
  { n.getChars(i-3,i,arr,0);
    t=new String(arr);
    s=t+","+s; 
   }
  if(i>0)
   s=","+s;
  for(i-=1;i>=0;i--)
    s=n.charAt(i)+s;
  /*s=","+s;
  for(int j=i-1;j>=0;j--)
   { s=n.charAt(j)+s;
   }*/
} 

System.out.println("New string:"+s);
}
}
