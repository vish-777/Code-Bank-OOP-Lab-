import java.util.Scanner;
class Card
{
	int rank;
	char suit;
	Card(int a,char b)
	{
		rank=a;
		suit=b;
	}
	char getsuit()
	{
		return suit;
	}
	int getrank()
	{
		return rank;
	}
}
class CardTester
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Card c[];
		int a,rank,con[],i,j;
		char b;
		con= new int[5];
		c=new Card[5];
		System.out.println("Enter the card details:");
		for(i=0;i<5;i++)
		{
			System.out.println("Card "+(i+1));
			System.out.print("Enter suit(S,C,D,H):");
			b=(in.next()).charAt(0);
			System.out.print("Enter rank(1 to 13):");
			a=in.nextInt();
			c[i]=new Card(a,b); 
		}
		for(i=0;i<5;i++)
		{
			rank=c[i].getrank();
			for(j=0;j<5;j++)
				if(rank==c[j].getrank())
					con[i]++;
		}
		for(i=0;i<5;i++)
		{
			if(con[i]==2 || con[i]==3)
				continue;
			else 
				break;
		}
		if(i==5)
			System.out.println("Full House!");
		else
			System.out.println("Not a Full House");
	}
}

			
			
