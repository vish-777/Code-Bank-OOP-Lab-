class Table
{
	synchronized void display(int x)
	{	
		for(int i=1;i<=10;i++)
			System.out.println(i+"*"+x+"="+x*i);
	}
} 

class DisplayTable extends Thread
{
	Thread th;
	Table t;
	int x;
	DisplayTable(Table a,int b)
	{
		th=new Thread(this);
		t=a;
		x=b;	
		th.start();
	}
	public void run()
	{t.display(x);}
}

class TableDemo
{
	public static void main(String[] args)
	{
		Table a=new Table();
		DisplayTable d1=new DisplayTable(a,5);
		DisplayTable d2=new DisplayTable(a,7);
	}
}