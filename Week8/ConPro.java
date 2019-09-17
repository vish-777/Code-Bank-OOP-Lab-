import java.util.Scanner;
class Q
{
	int n;
	synchronized void get()
	{System.out.println("Customer purchased "+(n+1));}
	synchronized void put(int n)
	{
		this.n=n;
		System.out.println("Produced "+(n+1));
  	}		
}	

class Producer implements Runnable
{
	int n;
	Q q;
	Thread thrd;
	Producer(Q x,int a)
	{ 
		n=a;
		q=x;
		thrd=new Thread(this);
  		thrd.start();
	}
	public void run()
	{ 
		for(int i=0;i<n;i++)
	        { 
			try 
			{ 
				q.put(i);
			        thrd.sleep(50);
	          	}
          		catch(InterruptedException e){} 
    		}
	}
}

class Consumer implements Runnable
{
	Q q;
	Thread thrd;
	int n;
	Consumer(Q x,int a)
	{ 
		n=a;
		q=x;
		thrd=new Thread(this);
  		thrd.start();
	}
	public void run()
	{ 
		for(int i=0;i<n;i++) 
		try
		{ 
	        	q.get(); 
       			thrd.sleep(100); 
      		}catch(InterruptedException e){}
  	}
}

class ConPro
{
	public static void main(String[] args)
	{ 
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of transcactions:");		
		int n=in.nextInt();
		Q q=new Q();
		Producer prod=new Producer(q,n);
  		Consumer cons=new Consumer(q,n);
	}
}